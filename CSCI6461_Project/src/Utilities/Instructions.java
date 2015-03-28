/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Utilities;
/**
 *
 * @author Aether
 */
import Storage.Memory;
import Storage.Registers;
import GUI.FrontPanel;
import static java.lang.Thread.sleep;


public class Instructions {
    Memory mem;
    Registers reg;
    FrontPanel GUI;
    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    static int thirtytwoBitMax = Integer.parseUnsignedInt("FFFFFFFF",16);
    /**
     * pass in the existing memory and register instance from main method
     * outside this class
     *
     * @param mem
     * @param reg
     */
    public Instructions(Memory mem, Registers reg, FrontPanel GUI) {
        this.mem = mem;
        this.reg = reg;
        this.GUI = GUI;
        
    }
    /**
     * computer the Effective Address according to I,IX,Address factors
     *
     * @param I
     * @param IX
     * @param Address
     * @return
     */
    public int computeEA(int I, int IX, int Address) {
        // System.out.println("Values of I, IX , and Address are " +I+ "," +IX+ ","+ Address);
        if (I == 0) {
            if (IX == 0) {
                return Address;
            } else {
                return reg.getXR(IX) + Address;
            }
        } else if (I == 1) {
            if (IX == 00) {
                reg.setMAR(Address);
                reg.setMBR(reg.getMAR());
                return mem.getMem(reg.getMBR());
            } else {
                //set condition code when EA is larger than the maximal length of memory
                if(reg.getXR(IX) + Address>2048){
                    reg.setCC(reg.getCC() | 8);
                    System.out.println("EA address overflow");
                }
                reg.setMAR(reg.getXR(IX) + Address);
                reg.setMBR(reg.getMAR());
                return mem.getMem(reg.getMBR());
            }
        }
        return -1;
    }
    /**
     * take a 16 bits string input like "110101101...". decode it and map it to
     * specific instruction
     *
     * @param instruction
     * @return
     */
    public static int[] isolateLoadStoreBits(int instruction) {
        int isolatedValues[];
        String insBinary = DataTypeConvertor.intToString(instruction, 16);
        // System.out.println("Binary string is "+insBinary);
        int Opcode = DataTypeConvertor.stringToInt(insBinary.substring(0, 6));
        int R = DataTypeConvertor.stringToInt(insBinary.substring(6, 8));
        int IX = DataTypeConvertor.stringToInt(insBinary.substring(8, 10));
        int I = DataTypeConvertor.stringToInt(insBinary.substring(10, 11));
        int Address = DataTypeConvertor.stringToInt(insBinary.substring(11, 16));
        isolatedValues = new int[]{Opcode, R, IX, I, Address};
        return isolatedValues;
    }
    public static int[] isolateShiftBits(int instruction){
        int isolatedValues[];
        String insBinary = DataTypeConvertor.intToString(instruction, 16);
        int Opcode = DataTypeConvertor.stringToInt(insBinary.substring(0, 6));
        int R = DataTypeConvertor.stringToInt(insBinary.substring(6, 8));
        int AorL = DataTypeConvertor.stringToInt(insBinary.substring(8, 9));
        int LorR = DataTypeConvertor.stringToInt(insBinary.substring(9, 10));
        int Count = DataTypeConvertor.stringToInt(insBinary.substring(12, 16));
        isolatedValues = new int[]{Opcode, R, AorL, LorR, Count};
        return isolatedValues;
    }
    public static int[] isolateIOBits(int instruction){
        int isolatedValues[];
        String insBinary = DataTypeConvertor.intToString(instruction, 16);
        int Opcode = DataTypeConvertor.stringToInt(insBinary.substring(0, 6));
        int R = DataTypeConvertor.stringToInt(insBinary.substring(6, 8));
        int DevID = DataTypeConvertor.stringToInt(insBinary.substring(11,16 ));
        isolatedValues = new int[]{Opcode, R, DevID};
        return isolatedValues;
    }
    // call helper functions to parse instruction into opcode, addresses, etc.
    // execute instruction according to switch-case statement
    // set variables and memory accordingly
    // return once processing has completed
    public void executeInstruction(int instruction) throws InterruptedException {
        //extract each part
        int isolatedValues[] = isolateLoadStoreBits(instruction);
        int isolatedShift[] = isolateShiftBits(instruction);
        int isolatedIO[] = isolateIOBits(instruction);
        int Opcode = isolatedValues[0];
        //for first type of instruction format
        int R,IX,I,Address,EA;
        //for second type of instruction format
        int Rx,Ry,temp1,temp2;
        String buffer;
        //for third type of instruction format
        int Reg,AorL,LorR,Count;
        //for forth type of instruction format
        int ioR, ioDevID;
        /**
         * NOTE: Project description opcodes are written in OCTAL (base 8) 000
         * 000 = 0 (octal) = 0 (decimal) 011 011 = 33 (octal) = 27 (decimal)
         */
        switch (Opcode) {
            //Load and Store instruction block
            case 1: //instruction for LDR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //MAR<-EA
                    reg.setMAR(EA);
                    //MDR<-M(MAR)
                    reg.setMBR(mem.getMem(reg.getMAR()));
                    //RF[FRI]<-MDR
                    reg.setGPR(R, reg.getMBR());
                } else {
                    //or if we can check machine fault register we can set for error
                    System.out.println("error: value of EA is " + EA);
                }
                break;
            case 2: //instruction for STR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //mem.setMem(EA, reg.getGPR(R));
                    //MAR<-EA
                    reg.setMAR(EA);
                    //MDR<-RF[FRI]
                    reg.setMBR(reg.getGPR(R));
                    //EA<-MDR
                    mem.setMem(reg.getMAR(), reg.getMBR());
                } else {
                    System.out.println("error");
                }
                break;
            case 3: //instruction for LDA
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //R<-EA;
                    reg.setGPR(R, EA);
                } else {
                    System.out.println("error");
                }
                break;
            case 33: //instruction for LDX
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //reg.setXR(R, mem.getMem(EA));
                    //MAR<-EA
                    reg.setMAR(EA);
                    //MDR<-M(MAR)
                    reg.setMBR(mem.getMem(reg.getMAR()));
                    //XR(R)<-MDR
                    reg.setXR(R, reg.getMBR());
                } else {
                    System.out.println("error");
                }
                break;
            case 34: //instruction for STX
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //mem.setMem(EA, reg.getXR(R));
                    //MAR<-EA
                    reg.setMAR(EA);
                    //MDR<-XR(R)
                    reg.setMBR(reg.getXR(R));
                    //M(MAR)<-MDR
                    mem.setMem(reg.getMAR(), reg.getMBR());
                } else {
                    System.out.println("error");
                }
                break;
                //Arithmetic and Logical instruction block
            case 4: //instruction for AMR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getGPR(R) + mem.getMem(EA) > sixteenBitMax) {
                        reg.setCC(reg.getCC() | 8);
                        reg.setGPR(R, reg.getGPR(R) + mem.getMem(EA));
                        reg.setCarry(1);
                        System.out.println("overflow");
                    }
                    else {
                        reg.setGPR(R, reg.getGPR(R) + mem.getMem(EA));
                    }
                }
                else {
                    System.out.println("overflow");
                }
                break;
            case 5: //instruction for SMR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    //reg.setGPR(R, reg.getGPR(R) - mem.getMem(EA));
                    //MAR<-EA
                    reg.setMAR(EA);
                    //MDR<-M(MAR)
                    reg.setMBR(reg.getMAR());
                    if (reg.getGPR(R) - mem.getMem(EA) < 0) {
                        reg.setCC(reg.getCC() | 8);
                        System.out.println("overflow");
                    }
                    else {
                        reg.setGPR(R, reg.getGPR(R) - mem.getMem(reg.getMBR()));
                    }
                }
                else {
                    System.out.println("error");
                }
                break;
            case 6: //instruction for AIR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                // EA = computeEA(I, IX, Address);
                // if (EA != -1 && EA <= 2048) {
                if (reg.getGPR(R) + Address > sixteenBitMax) {
                    reg.setCC(reg.getCC() | 8);
                    System.out.println("overflow");
                    reg.setCarry(1);
                    reg.setGPR(R, reg.getGPR(R) + Address);
                } else {
                    reg.setGPR(R, reg.getGPR(R) + Address);
                }
                // } else {
                // System.out.println("error");
                // }
                break;
            case 7: //instruction for SIR
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                // EA = computeEA(I, IX, Address);
                // if (EA != -1 && EA <= 2048) {
                if (reg.getGPR(R) - Address < 0) {
                    reg.setCC(reg.getCC() | 8);
                    System.out.println("overflow");
                } else{
                    reg.setGPR(R, reg.getGPR(R) - Address);
                }
                // } else {
                // System.out.println("error");
                // }
                break;
                //Transfer instruction block
            case 8: //instruction for JZ
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getGPR(R) == 0) {
                        reg.setPC(EA);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("error");
                }
                break;
            case 9: //instruction for JNE
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getGPR(R) != 0) {
                        reg.setPC(EA);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("error");
                }
                break;
            case 10: //instruction for JCC
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    int ccbit;
                    if (R == 0) ccbit = 0;
                    else ccbit = 1 << (R-1);
                    if (reg.getCC() == ccbit) {
                        reg.setCC(0);
                        reg.setPC(EA);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("error");
                }
                break;
            case 11: //instruction for JMA
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setPC(EA);
                } else {
                    System.out.println("error");
                }
                break;
            case 12: //instruction for JSR.
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(3, reg.getPC()+1);
                    reg.setPC(EA);
                    reg.setGPR(0, reg.getPC());
                    reg.setJMPR(reg.getGPR(3));
                } else {
                    System.out.println("error");
                }
                break;
                //jump back, if the subroutine reach to the end with -17777
            case -17777:
                reg.setPC(reg.getJMPR());
                break;
            case 13: //instruction for RFS
                R = isolatedValues[1];
                Address = isolatedValues[4];
                reg.setGPR(0, Address);
                reg.setPC(reg.getGPR(3));
                break;
            case 14: //instruction for SOB
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                System.out.println("Computed an EA of " + EA);
                reg.setGPR(R, reg.getGPR(R)-1);
                reg.setPC(EA);
                break;
            case 15: //instruction for JGE
                R = isolatedValues[1];
                IX = isolatedValues[2];
                I = isolatedValues[3];
                Address = isolatedValues[4];
                EA = computeEA(I, IX, Address);
                if(reg.getGPR(R)>=0)
                    reg.setPC(EA);
                break;
                //arithmetic instruction block
            case 16: //instruction for MLT
                Rx = isolatedValues[1];
                Ry = isolatedValues[2];
                if(reg.getGPR(Rx)==1 ||reg.getGPR(Rx)==3 || reg.getGPR(Ry)==1 || reg.getGPR(Ry)==3){
                    System.out.println("Invalid register");
                    break;
                }
                temp1 = reg.getGPR(Rx)*reg.getGPR(Ry);
                //check overflow
                if(temp1 > thirtytwoBitMax){
                    reg.setCC(reg.getCC() | 8);
                    System.out.println("overflow");
                    reg.setCarry(1);
                }
                //change the result to 32 bits. Pad 0 when less than 32, or cut lower 32 bits when exceed 32 bits
                buffer = DataTypeConvertor.intToString(temp1, 32);
                if(buffer.length()>32){
                    buffer.subSequence(0, 32);
                }
                reg.setGPR(Rx, DataTypeConvertor.stringToInt(buffer.substring(0, 16)));
                reg.setGPR(Rx+1, DataTypeConvertor.stringToInt(buffer.substring(16, 32)));
                break;
            case 17: //instruction for DVD
                Rx = isolatedValues[1];
                Ry = isolatedValues[2];
                if(reg.getGPR(Rx)==1 ||reg.getGPR(Rx)==3 || reg.getGPR(Ry)==1 || reg.getGPR(Ry)==3){
                    System.out.println("Invalid register");
                    break;
                }
                //check zero divider (set third bit to 1)
                if(reg.getGPR(Ry)==0){
                    reg.setCC(reg.getCC()|2);
                    System.out.println("zero divider");
                }
                temp1 = reg.getGPR(Rx)/reg.getGPR(Ry);
                temp2 = reg.getGPR(Rx)%reg.getGPR(Ry);
                reg.setGPR(Rx, temp1);
                reg.setGPR(Rx+1, temp2);
                break;
            case 18: //instruction for TRR
                Rx = isolatedValues[1];
                Ry = isolatedValues[2];
                //set the 4th bit of CC to 1
                if(Rx==Ry)
                    reg.setCC(reg.getCC()|1);
                //set 4th bit of CC to 0, by using "and" operation with 1110
                else
                    reg.setCC(reg.getCC()&14);
                break;
            case 19: //instruction for AND
                Rx = isolatedValues[1];
                Ry = isolatedValues[2];
                reg.setGPR(Rx, Rx&Ry);
                break;
            case 20: // instruction for ORR
                Rx = isolatedValues[1];
                Ry = isolatedValues[2];
                reg.setGPR(Rx, Rx|Ry);
                break;
            case 21: //instruction for NOT
                Rx = isolatedValues[1];
                reg.setGPR(Rx, ~reg.getGPR(Rx));
                break;
                //shift and rotate instruction block
            case 25: //instruction for SRC
                Reg = isolatedShift[1];
                AorL = isolatedShift[2];
                LorR = isolatedShift[3];
                Count = isolatedShift[4];
                char signFlag;
                char[] shiftResult = new char[16];
                // arithmetic shift right (I have considered using >> operation, but the 16 bits length with sign bit and the "int" format we use for memory make it a little tricky when implement, so I write a new function)
                //pad 1 at left for negative number pad 0 for positive number, and keep sign bit
                //"1100011011000010" -> 3 bits -> 1111100011011000
                if(AorL == 0 && LorR == 0){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    signFlag = buffer.charAt(0);
                    for(int i=0;i<16-Count;i++){
                        shiftResult[i+Count]=buffer.charAt(i);
                    }
                    for(int i=0;i<Count;i++){
                        shiftResult[i]=signFlag;
                    }
                    buffer="";
                    for(char i:shiftResult){
                        buffer+=i;
                    }
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                // arithmetic shift left
                //"1100011011000010" -> 3 bits -> 1011011000010000
                if(AorL == 0 && LorR == 1){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    signFlag = buffer.charAt(0);
                    for(int i=0;i<16-Count;i++){
                        shiftResult[i]=buffer.charAt(i+Count);
                    }
                    for(int i=16-Count;i<16;i++){
                        shiftResult[i]='0';
                    }
                    shiftResult[0]=signFlag;
                    buffer="";
                    for(char i:shiftResult){
                        buffer+=i;
                    }
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                // logical shift right
                //"1100011011000010" -> 3 bits -> 0001100011011000
                if(AorL == 1 && LorR == 0){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    for(int i=0;i<16-Count;i++){
                        shiftResult[i+Count]=buffer.charAt(i);
                    }
                    for(int i=0;i<Count;i++){
                        shiftResult[i]='0';
                    }
                    buffer="";
                    for(char i:shiftResult){
                        buffer+=i;
                    }
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                // logical shift left
                //"1100011011000010" -> 3 bits -> 0011011000010000
                if(AorL == 1 && LorR == 1){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    signFlag = buffer.charAt(0);
                    for(int i=0;i<16-Count;i++){
                        shiftResult[i]=buffer.charAt(i+Count);
                    }
                    for(int i=16-Count;i<16;i++){
                        shiftResult[i]='0';
                    }
                    buffer="";
                    for(char i:shiftResult){
                        buffer+=i;
                    }
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                break;
            case 26: //instruction for RRC
                Reg = isolatedShift[1];
                AorL = isolatedShift[2];
                LorR = isolatedShift[3];
                Count = isolatedShift[4];
                char rotateSignFlag;
                char[] rotateResult = new char[16];
                char[] rotateBit = new char[Count];
                // arithmetic rotate right
                //"1100011011000010" -> 3 bits -> 1010100011011000
                if(AorL == 0 && LorR == 0){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    rotateSignFlag = buffer.charAt(0);
                    for(int i=0;i<Count;i++){
                        rotateBit[i]=buffer.charAt(16-Count+i);
                    }
                    for(int i=0;i<16-Count;i++){
                        rotateResult[i+Count]=buffer.charAt(i);
                    }
                    for(int i=0;i<Count;i++){
                        rotateResult[i+1]=rotateBit[i];
                    }
                    rotateResult[0]=rotateSignFlag;
                    buffer="";
                    for(char i:rotateResult){
                        buffer+=i;
                    }
                }
                // arithmetic rotate left
                //"1100011011000010" -> 3 bits -> 1011011000010100
                if(AorL == 0 && LorR == 1){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    signFlag = buffer.charAt(0);
                    rotateSignFlag = buffer.charAt(0);
                    for(int i=0;i<Count;i++){
                        rotateBit[i]=buffer.charAt(i+1);
                    }
                    for(int i=0;i<16-Count;i++){
                        rotateResult[i]=buffer.charAt(i+Count);
                    }
                    for(int i=0;i<Count;i++){
                        rotateResult[16-Count+i]=rotateBit[i];
                    }
                    rotateResult[0]=rotateSignFlag;
                    buffer="";
                    for(char i:rotateResult){
                        buffer+=i;
                    }
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                // logical rotate right
                //"1100011011000010" -> 3 bits -> 0101100011011000
                if(AorL == 1 && LorR == 0){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    for(int i=0;i<Count;i++){
                        rotateBit[i]=buffer.charAt(16-Count+i);
                    }
                    for(int i=0;i<16-Count;i++){
                        rotateResult[i+Count]=buffer.charAt(i);
                    }
                    for(int i=0;i<Count;i++){
                        rotateResult[i]=rotateBit[i];
                    }
                    buffer="";
                    for(char i:rotateResult){
                        buffer+=i;
                    }
                }
                // logical rotate left
                //"1100011011000010" -> 3 bits -> 0011011000010110
                if(AorL == 1 && LorR == 1){
                    buffer = DataTypeConvertor.intToString(reg.getGPR(Reg), 16);
                    for(int i=0;i<Count;i++){
                        rotateBit[i]=buffer.charAt(i);
                    }
                    for(int i=0;i<16-Count;i++){
                        rotateResult[i]=buffer.charAt(i+Count);
                    }
                    for(int i=0;i<Count;i++){
                        rotateResult[16-Count+i]=rotateBit[i];
                    }
                    buffer="";
                    for(char i:rotateResult){
                        buffer+=i;
                    }
                    System.err.println(buffer);
                    reg.setGPR(Reg, DataTypeConvertor.stringToInt(buffer));
                }
                break;
                //IO instruction block
            case 49: //instruction for IN
                ioR = isolatedShift[1];
                ioDevID = isolatedIO[2];
                if (ioDevID == 0) {
                    while(!GUI.userInput){
                        sleep(50);
                    }
                    Integer num;
                    try {
                        num = Integer.parseInt(GUI.getConsoleInput());
                    } catch (NumberFormatException e) {
                        if (GUI.getConsoleInput().length() == 1) {
                            num = (int) GUI.getConsoleInput().charAt(0);
                        }
                        else num = 0;
                    }
                    if ((num < 0) || (num > 65535)) num = 0;
                    reg.setGPR(ioR, num);
                    
                }
                break;
                //IO instruction block
            case 50: //instruction for OUT
                ioR = isolatedShift[1];
                ioDevID = isolatedIO[2];
                if (ioDevID == 1) {
//                    if ((reg.getGPR(ioR) > 31) && (reg.getGPR(ioR) < 127)) {
//                        String hold = "" + (char) reg.getGPR(ioR);
//                        GUI.updatePrinter(hold);
//                    }
//                    else
                    GUI.updatePrinter(Integer.toString(reg.getGPR(ioR)) + " ");
                }
                break;
                //IO instruction block
            case 51: //instruction for CHK
                ioR = isolatedShift[1];
                ioDevID = isolatedIO[2];
                break;
            default:
                break;
        }
    }
}