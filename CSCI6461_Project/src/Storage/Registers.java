/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

/**
 *
 * @author Aether
 */
public class Registers {

    // integers and integer arrays to contain register value
    int GPR[];
    int XR[];
    int FR[];
    int PC;
    int CC;
    int IR;
    int MAR;
    int MBR;
    int MSR;
    int MFR;
    int Carry;
    int JMPR;
    
    // changed flags to indicate the need for a GUI update
    public boolean GPR_changed[];
    public boolean XR_changed[];
    public boolean FR_changed[];
    public boolean PC_changed;
    public boolean CC_changed;
    public boolean IR_changed;
    public boolean MAR_changed;
    public boolean MBR_changed;
    public boolean MSR_changed;
    public boolean MFR_changed;
    public boolean Carry_changed;

    // max values
    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    static int twelveBitMax = Integer.parseInt("FFF", 16);
    static int fourBitMax = Integer.parseInt("F", 16);

    // instantiate registers
    public Registers() {
        GPR = new int[4];
        XR = new int[3];      
        FR = new int[2];      
        GPR_changed = new boolean[4];
        XR_changed = new boolean[3];
        zeroize();
    }

    // set all registers and flags to 0
    public void zeroize() {
        for (int i = 0; i < GPR.length; i++) {
            GPR[i] = 0;
            GPR_changed[i] = false;
        }
        for (int i = 0; i < XR.length; i++) {
            XR[i] = 0;
            XR_changed[i] = false;
        }
        for (int i = 0; i < FR.length; i++) {
            FR[i] = 0;
            FR_changed[i] = false;
        }
        PC = 0;
        CC = 0;
        IR = 0;
        MAR = 0;
        MBR = 0;
        MSR = 0;
        MFR = 0;
        
        PC_changed = false;
        CC_changed = false;
        IR_changed = false;
        MAR_changed = false;
        MBR_changed = false;
        MSR_changed = false;
        MFR_changed = false;
        Carry_changed = false;
    }
    
    // method to reset the changed flags
    public void resetChangedFlags() {
        for (int i = 0; i < GPR.length; i++) {
            GPR_changed[i] = false;
        }
        for (int i = 0; i < XR.length; i++) {
            XR_changed[i] = false;
        }
        for (int i = 0; i < FR.length; i++) {
            FR_changed[i] = false;
        }

        PC_changed = false;
        CC_changed = false;
        IR_changed = false;
        MAR_changed = false;
        MBR_changed = false;
        MSR_changed = false;
        MFR_changed = false;
    }

    // GPR getter method. returns the value of the designated GPR
    public int getGPR(int regNum) {
        if (regNum < GPR.length) {
            return GPR[regNum];
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

    // GPR setter method. Sets the designated GPR with the supplied value 
    // as long as the numbers are valid (register number and value)
    public int setGPR(int regNum, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = sixteenBitMax;
        if ((regNum < GPR.length) && (value <= max)) {
            GPR[regNum] = value;
            GPR_changed[regNum] = true;
        }
        if (regNum >= GPR.length) {
            status += 1;
        }
        if (value > max) {    
            value = value & sixteenBitMax;
            GPR[regNum] = value;
            GPR_changed[regNum] = true;
            status += 2;
        }
        return status;
    }
    
        // FR getter method. returns the value of the designated FR
    public int getFR(int regNum) {
        if (regNum < FR.length) {
            return FR[regNum];
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

    // FR setter method. Sets the designated FR with the supplied value 
    // as long as the numbers are valid (register number and value)
    public int setFR(int regNum, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = sixteenBitMax;
        if ((regNum < FR.length) && (value <= max)) {
            FR[regNum] = value;
            FR_changed[regNum] = true;
        }
        if (regNum >= FR.length) {
            status += 1;
        }
        if (value > max) {    
            value = value & sixteenBitMax;
            FR[regNum] = value;
            FR_changed[regNum] = true;
            status += 2;
        }
        return status;
    }

    // XR getter, see GPR documentation
    public int getXR(int regNum) {
        regNum = regNum-1;
        if (regNum < 0 || regNum > XR.length) {
            return twelveBitMax + 1;
        } // return value exceeding 12-bit word to denote bad addressing
        else {
            return XR[regNum];
        }
    }

    //XR setter, see GPR documentation 
    public int setXR(int regNum, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = twelveBitMax;
        regNum = regNum - 1;
        if ((regNum < XR.length) && (value <= max)) {
            XR[regNum] = value;
            XR_changed[regNum] = true;

        }
        if (regNum >= XR.length) {
            status += 1;
        }
        if (value > max) {
            value = value & sixteenBitMax;
            XR[regNum] = value;
            XR_changed[regNum] = true;
            status += 2;
        }
        return status;
    }

    // PC getter, returns value of PC
    public int getPC() {
        return PC;
    }

    // PC setter, see GPR documentation
    public int setPC(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = twelveBitMax;
        if (value <= max) {
            PC = value;
            PC_changed = true;
        } else {
            status = 2;
        }
        return status;
    }

    // CC getter, returns value of CC
    public int getCC() {
        return CC;
    }

    // CC setter, see GPR documentation
    public int setCC(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = fourBitMax;
        if (value <= max) {
            CC = value;
            CC_changed = true;
        } else {
            status = 2;
        }
        return status;
    }

    // IR getter, returns value of IR
    public int getIR() {
//        System.out.println("Value of IR is " + IR);
        return IR;
    }

    // IR setter, see GPR documentation
    public int setIR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = sixteenBitMax;
        if (value <= max) {
            IR = value;
            IR_changed = true;
//            System.out.println("New value of IR is " + value);
        } else {
            status = 2;
        }
        return status;
    }

    // MAR getter, returns value of MAR
    public int getMAR() {
        return MAR;
    }

    // MAR setter, see GPR documentation
    public int setMAR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 1;
        int max = sixteenBitMax;
        if (value <= max) {
            MAR = value;
            MAR_changed = true;
        } else {
            status = 2;
        }
        return status;
    }

    // MBR getter, returns value of MBR
    public int getMBR() {
        return MBR;
    }

    // MBR setter, see GPR documentation
    public int setMBR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 1;
        int max = sixteenBitMax;
        if (value <= max) {
            MBR = value;
            MBR_changed = true;
        } else {
            status = 2;
        }
        return status;
    }

    // MSR getter, returns value of MSR
    public int getMSR() {
        return MSR;
    }

    // MSR setter, see GPR documentation
    public int setMSR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 1;
        int max = sixteenBitMax;
        if (value <= max) {
            MSR = value;
            MSR_changed = true;
        } else {
            status = 2;
        }
        return status;
    }

    // MFR getter, returns value of MFR
    public int getMFR() {
        return MFR;
    }

    // MFR setter, see GPR documentation
    public int setMFR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 1;
        int max = fourBitMax;
        if (value <= max) {
            MFR = value;
            MFR_changed = true;
        } else {
            status = 2;
        }
        return status;
    }
    
        // Carry getter, returns value of Carry
    public int getCarry() {
        return Carry;
    }

    // Carry setter, see Carry documentation
    public int setCarry(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        Carry = value;
        Carry_changed = true;
        return status;
    }
    
    // Jump register. Used for keeping the address for jump and return statement 
    public int getJMPR(){
    	return JMPR;
    }
    
    public void setJMPR(int address){
    	JMPR = address;
    }
}
