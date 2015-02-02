/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import java.util.Vector;

/**
 *
 * @author Aether
 */
public class Memory {

    Vector<Integer> memory;
    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    
    public Memory(int memLength) {
        memory = new Vector<>(memLength);
        zeroize();
    }

    public int getMemoryLength() {
        return memory.capacity();
    }
            
    public void zeroize() {
        for (int i = 0; i < 2048; i++) {
            memory.add(i, 0);
        }
        // set values at reserved memory spaces [0..5] if required
    }

    public int getMem(int location) {
        if (location < getMemoryLength()) {
            return memory.get(location);
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

    public int setMem(int location, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is a value overflow
        // status of 4 is attempt to overwrite reserved memory
        int status = 0;
        int max = sixteenBitMax;
        int reserved = 5;
        if ((location > reserved) && (location < getMemoryLength()) && (value <= max)) {
            memory.set(location, value);    
        }
        if (location >= getMemoryLength()) {
            status += 1;
        }
        if (value > max) {
            status += 2;
        }
        if (location <= reserved) {
            status += 4;
        }
        return status;
    }
}
