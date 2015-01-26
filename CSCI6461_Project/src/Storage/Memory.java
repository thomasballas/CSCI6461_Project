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
public class Memory {

    static int memory[];
    static int sixteenBitMax = Integer.parseInt("FFFF", 16);

    ;

    
    public Memory() {
        memory = new int[2048];
        zeroize();
    }

    public void zeroize() {
        for (int i = 0; i < 2048; i++) {
            memory[i] = 0;
        }
    }

    public int getMem(int location) {
        if (location < memory.length) {
            return memory[location];
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

    public int setMem(int location, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is overflow
        int status = 0;
        int max = sixteenBitMax;
        if ((location < memory.length) && (value <= max)) {
            memory[location] = value;
        }
        if (location >= memory.length) {
            status += 1;
        }
        if (value > max) {
            status += 2;
        }
        return status;
    }
}
