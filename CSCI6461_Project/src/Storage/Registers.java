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

    int GPR[];
    int XR[];
    int PC;
    int CC;
    int IR;
    int MAR;
    int MBR;
    int MSR;
    int MFR;
    
    public boolean GPR_changed[];
    public boolean XR_changed[];
    public boolean PC_changed;
    public boolean CC_changed;
    public boolean IR_changed;
    public boolean MAR_changed;
    public boolean MBR_changed;
    public boolean MSR_changed;
    public boolean MFR_changed;

    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    static int twelveBitMax = Integer.parseInt("FFF", 16);
    static int fourBitMax = Integer.parseInt("F", 16);

    public Registers() {
        GPR = new int[4];
        XR = new int[3];      
        GPR_changed = new boolean[4];
        XR_changed = new boolean[3];
        zeroize();
    }

    public void zeroize() {
        for (int i = 0; i < GPR.length; i++) {
            GPR[i] = 0;
            GPR_changed[i] = false;
        }
        for (int i = 0; i < XR.length; i++) {
            XR[i] = 0;
            XR_changed[i] = false;
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
    }
    
    public void resetChangedFlags() {
        for (int i = 0; i < GPR.length; i++) {
            GPR_changed[i] = false;
        }
        for (int i = 0; i < XR.length; i++) {
            XR_changed[i] = false;
        }

        PC_changed = false;
        CC_changed = false;
        IR_changed = false;
        MAR_changed = false;
        MBR_changed = false;
        MSR_changed = false;
        MFR_changed = false;
    }

    public int getGPR(int regNum) {
        if (regNum < GPR.length) {
            return GPR[regNum];
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

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
            status += 2;
        }
        return status;
    }

    public int getXR(int regNum) {
        regNum = regNum-1;
        if (regNum < 0 || regNum > XR.length) {
            return twelveBitMax + 1;
        } // return value exceeding 12-bit word to denote bad addressing
        else {
            return XR[regNum];
        }
    }

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
            status += 2;
        }
        return status;
    }

    public int getPC() {
        return PC;
    }

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

    public int getCC() {
        return CC;
    }

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

    public int getIR() {
        System.out.println("Value of IR is " + IR);
        return IR;
    }

    public int setIR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = sixteenBitMax;
        if (value <= max) {
            IR = value;
            IR_changed = true;
            System.out.println("New value of IR is " + value);
        } else {
            status = 2;
        }
        return status;
    }

    public int getMAR() {
        return MAR;
    }

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

    public int getMBR() {
        return MBR;
    }

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

    public int getMSR() {
        return MSR;
    }

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

    public int getMFR() {
        return MFR;
    }

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
}
