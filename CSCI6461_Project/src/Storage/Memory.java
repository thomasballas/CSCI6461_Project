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
class CacheLine {
    int address;
    int value;
    int dirtyBit;
    
    public CacheLine(int address, int value, int dirtyBit) {
        this.address = address;
        this.value = value;
        this.dirtyBit = dirtyBit;
    }
    
}

public class Memory {

    Vector<Integer> memory;
    Vector<CacheLine> cache;
    static int sixteenBitMax = Integer.parseInt("FFFF", 16);
    
    public Memory(int memLength) {
        memory = new Vector<>(memLength);
        cache = new Vector<>(0);
        zeroize();
    }

    // length getter
    public int getMemoryLength() {
        return memory.capacity();
    }
    
    public void printCache () {
        System.out.println("PRINTING CACHE:");
        for (int i = 0 ; i < cache.size(); i++) {
            int value = cache.elementAt(i).value;
            int location = cache.elementAt(i).address;
            int dirtyBit = cache.elementAt(i).dirtyBit;
            System.out.println("Cache line " +i+ ": (" + location+ ", " +value + ", " + dirtyBit + ")");
        }
        System.out.println("\n");
    }
            
    // assign zero to all values of memory
    public void zeroize() {
        cache.clear();
        memory.clear();           
        for (int i = 0; i < 2048; i++) {
            memory.add(i, 0);
        }
        // set values at reserved memory spaces [0..5] if required
    }

    // getter method for memory; checks for valid addressing
    public int getMem(int location) {
        if (location < getMemoryLength()) {
            //check cache contents. return if address found in cache.
            for (int i = 0; i < cache.size(); i++) {
                if (cache.elementAt(i).address == location) {
                    System.out.println("Cache Hit for address " + location);
                    CacheLine hold = cache.elementAt(i);
                    cache.remove(i);
                    cache.add(0, hold);
                    printCache();
                    return hold.value;
                }
            }
            //otherwise, retrieve the value from memory and add it to the cache
            System.out.println("Cache Miss for address " + location + ". Adding it to cache.");
            int value = memory.get(location);
            CacheLine newLine = new CacheLine(location, value, 0);
            
            //if the cache is full, write the least used value (last in vector) back to memory before adding new entry to head of vector.
            if (cache.size() >= 16) {
                System.out.println("Cache is full. Removing least used entry from cache.");
                if (cache.lastElement().dirtyBit == 1) {
                    int memAddress = cache.lastElement().address;
                    int memValue = cache.lastElement().value;
                    memory.set(memAddress, memValue);
                    System.out.println("Least used cache entry had set dirty bit. Wrote back to memory address "+memAddress+" the value "+memValue+".");
                }
                cache.removeElementAt(cache.size()-1);                
            }
            cache.add(0, newLine);
            System.out.println("Added cache line (address, value, dirtybit) of (" + location+ ", " +value + ", " +0 + ")");
            printCache();
            return newLine.value;
        } // return value exceeding 16-bit word to denote bad addressing
        else {
            return sixteenBitMax + 1;
        }
    }

    public void writeMem(int instructions[]) {
        int memLoc = 31;
//        System.out.println(memory.capacity());
        for (int i = 0; i<instructions.length; i++) {
            if (memLoc > memory.capacity()) return;
            memory.set(memLoc, instructions[i]);
            memLoc++;
        }
    }
    
    public void writeData(int data[]) {
        int memLoc = (2047 - data.length);
//        System.out.println(memory.capacity());
        for (int i = 0; i<data.length; i++) {
            if (memLoc > memory.capacity()) return;
            memory.set(memLoc, data[i]);
            System.out.println("Loaded data ("+data[i]+") at memory location ("+memLoc+")");
            memLoc++;
        }
    }
    
    // memory setter; checks for valid addressing and values
    public int setMem(int location, int value) {
        // status is good (0) or bad (other; can be combined)
        // status of 1 is bad register addressing
        // status of 2 is a value overflow
        // status of 4 is attempt to overwrite reserved memory
        int status = 0;
        int max = sixteenBitMax;
        int reserved = 5;
        if ((location > reserved) && (location < getMemoryLength()) && (value <= max)) {
            //check cache contents. modify if address found in cache.
            for (int i = 0; i < cache.size(); i++) {
                if (cache.elementAt(i).address == location) {
                    System.out.println("Cache Hit for address " + location);
                    CacheLine hold = cache.elementAt(i);
                    cache.remove(i);
                    hold.value = value;
                    hold.dirtyBit = 1;
                    cache.add(0, hold);
                    System.out.println("Modified cache line (address, value, dirtybit) of (" + location+ ", " +value + ", " + 1 + ")");
                    printCache();
                    return 0;
                }
            }
            //otherwise, create a new cache line with the desired value
            System.out.println("Cache Miss for address " + location + ". Adding it to cache.");
            CacheLine newLine = new CacheLine(location, value, 1);
            //if the cache is full, write the least used value (last in vector) back to memory before adding new entry to head of vector.
            if (cache.size() >= 16) {
                System.out.println("Cache is full. Removing least used entry from cache.");
                if (cache.lastElement().dirtyBit == 1) {
                    int memAddress = cache.lastElement().address;
                    int memValue = cache.lastElement().value;
                    memory.set(memAddress, memValue);
                    System.out.println("Least used cache entry had set dirty bit. Wrote back to memory address "+memAddress+" the value "+memValue+".");
                }
                cache.removeElementAt(cache.size()-1);                
            }
            cache.add(0, newLine);
            System.out.println("Added cache line (address, value, dirtybit) of (" + location+ ", " +value + ", " +1 + ")");
            printCache();
            return 0;
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
