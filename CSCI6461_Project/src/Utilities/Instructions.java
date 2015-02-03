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

public class Instructions {

    
    Memory mem;
    Registers reg;
    
    /** pass in the existing memory and register instance from main method 
     * outside this class
     * 
     * @param mem
     * @param reg 
     */
    public Instructions(Memory mem, Registers reg) {
        this.mem = mem;
        this.reg = reg;
    }

    /** computer the Effective Address according to I,IX,Address factors
     * 
     * @param I
     * @param IX
     * @param Address
     * @return 
     */
    public int computeEA(int I, int IX, int Address) {
        if (I == 0) {
            if (IX == 0) {
                return Address;
            }
            else {
                return reg.getXR(IX) + Address;
            }
        } else if (I == 1) {
            if (IX == 00) {
                return mem.getMem(Address);
            }
            else {
                return mem.getMem(reg.getXR(IX) + Address);
            }
        }
        return -1;
    }

    /** take a 16 bits string input like "110101101...". 
     * decode it and map it to specific instruction
     * 
     * @param instruction 
     * @return  
     */
    public static int[] isolateLoadStoreBits(int instruction) {
        
        int isolatedValues[];

        String insBinary = DataTypeConvertor.intToString(instruction, 16);
        int Opcode = DataTypeConvertor.stringToInt(insBinary.substring(0, 6));
        int R = DataTypeConvertor.stringToInt(insBinary.substring(6, 8));
        int IX = DataTypeConvertor.stringToInt(insBinary.substring(8, 10));
        int I = DataTypeConvertor.stringToInt(insBinary.substring(10));
        int Address = DataTypeConvertor.stringToInt(insBinary.substring(11, 16));
        
        isolatedValues= new int[]{Opcode, R, IX, I, Address};
        
        return isolatedValues;
    }
    
    public void executeInstruction(int instruction) {

        int isolatedValues[] = isolateLoadStoreBits(instruction);
        int Opcode = isolatedValues[0];
        int R = isolatedValues[1];
        int IX = isolatedValues[2];
        int I = isolatedValues[3];
        int Address = isolatedValues[4];        
        
        int EA = 0;

        /** NOTE: Project description opcodes are written in OCTAL (base 8)
         * 000 000 = 0 (octal) =  0 (decimal)
         * 011 011 = 33 (octal) = 27 (decimal)
         */
        switch (Opcode) {

            //Load and Store instruction block
            case 1: //instruction for LDR
                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, mem.getMem(EA));
                } else {
                    System.out.println("error");
                }

                break;

            case 2: //instruction for STR

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    mem.setMem(EA, reg.getGPR(R));
                } else {
                    System.out.println("error");
                }

                break;

            case 3: //instruction for LDA

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, EA);
                } else {
                    System.out.println("error");
                }

                break;

            case 33: //instruction for LDX

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setXR(R, mem.getMem(EA));
                } else {
                    System.out.println("error");
                }

                break;

            case 34: //instruction for STX

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    mem.setMem(EA, reg.getXR(R));
                } else {
                    System.out.println("error");
                }

                break;

            //Arithmetic and Logical instruction block
            case 4: //instruction for AMR

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, reg.getGPR(R) + mem.getMem(EA));
                } else {
                    System.out.println("error");
                }

                break;

            case 5: //instruction for SMR

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, reg.getGPR(R) - mem.getMem(EA));
                } else {
                    System.out.println("error");
                }

                break;

            case 6: //instruction for AIR

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, reg.getGPR(R) + Address);
                } else {
                    System.out.println("error");
                }

                break;

            case 7: //instruction for SIR

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setGPR(R, reg.getGPR(R) - Address);
                } else {
                    System.out.println("error");
                }

                break;

            //Transfer instruction block
            case 8: //instruction for JZ

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getGPR(R) == 1) {
                        reg.setPC(EA);
                    } else {
                        reg.setPC(reg.getPC() + 1);
                    }
                } else {
                    System.out.println("error");
                }

                break;

            case 9: //instruction for JNE

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getGPR(R) != 0) {
                        reg.setPC(EA);
                    } else {
                        reg.setPC(reg.getPC() + 1);
                    }
                } else {
                    System.out.println("error");
                }

                break;

            case 10: //instruction for JCC

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    if (reg.getCC() == 1) {
                        reg.setPC(EA);
                    } else {
                        reg.setPC(reg.getPC() + 1);
                    }
                } else {
                    System.out.println("error");
                }

                break;

            case 11: //instruction for JMA

                EA = computeEA(I, IX, Address);
                if (EA != -1 && EA <= 2048) {
                    reg.setPC(EA);
                } else {
                    System.out.println("error");
                }

                break;

            default:
                break;
        }
    }

//    public static void LoadRegisterFromMemory(int rNum, int xNum, int addr) {
//
//    }
//
//    public static void StoreRegisterToMemory(int rNum, int xNum, int addr) {
//
//    }
//
//    public static void LoadRegisterWithAddress(int rNum, int xNum, int addr) {
//
//    }
//
//    public static void LoadIndexRegisterFromMemory(int x1Num, int x2Num, int addr) {
//
//    }
//
//    public static void StoreIndexRegisterToMemory(int x1Num, int x2Num, int addr) {
//
//    }
}
