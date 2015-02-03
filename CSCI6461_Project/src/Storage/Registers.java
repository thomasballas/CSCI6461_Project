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

    static int GPR[];
    static int XR[];
    static int PC;
    static int CC;
    static int IR;
    static int MAR;
    static int MBR;
    static int MSR;
    static int MFR;

    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    static int twelveBitMax = Integer.parseInt("FFF", 16);
    static int fourBitMax = Integer.parseInt("F", 16);

    public Registers() {
        GPR = new int[4];
        XR = new int[3];
        zeroize();
    }

    public void zeroize() {
        for (int i = 0; i < GPR.length; i++) {
            GPR[i] = 0;
        }
        for (int i = 0; i < XR.length; i++) {
            XR[i] = 0;
        }
        PC = 0;
        CC = 0;
        IR = 0;
        MAR = 0;
        MBR = 0;
        MSR = 0;
        MFR = 0;
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
        if (regNum < XR.length) {
            return XR[regNum];
        } // return value exceeding 12-bit word to denote bad addressing
        else {
            return twelveBitMax + 1;
        }
    }

    public int setXR(int regNum, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = twelveBitMax;
        if ((regNum < XR.length) && (value <= max)) {
            XR[regNum] = value;
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
        } else {
            status = 2;
        }
        return status;
    }

    public int getIR() {
        return IR;
    }

    public int setIR(int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 1;
        int max = sixteenBitMax;
        if (value <= max) {
            IR = value;
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
        } else {
            status = 2;
        }
        return status;
    }
}
