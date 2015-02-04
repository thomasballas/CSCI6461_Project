/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import Storage.Memory;
import Utilities.DataTypeConvertor;

/**
 *
 * @author Aether
 */
public class Part1MemorySetter {
    public static void setMemory(Memory mem) {
        // Create int representation of "LDR 3, 0, 31"
        int LDRinst = DataTypeConvertor.stringToInt("0000011100011111");
        // Create int representation of "LDX 1, 0, 20"
        int LDXinst = DataTypeConvertor.stringToInt("1000010100010100"); 
        // Create int representation of "LDR 2, 0, 30"
        int LDR2inst = DataTypeConvertor.stringToInt("0000011000011110");
        // Create int representation of "AMR 2, 1, 24"
        int AMRinst = DataTypeConvertor.stringToInt("0001001001011000");
        // Create int representation of "STR 2, 0, 29"
        int STRinst = DataTypeConvertor.stringToInt("0000101000011101");
        // Create int representation of "LDA 1, 0, 29"
        int LDA3inst = DataTypeConvertor.stringToInt("0000110100011101");
        // Create int representation of "SMR 3, 1, 24"
        int SMRinst = DataTypeConvertor.stringToInt("0001011101011000");
        // Create int representation of "AIR 0, 1"
        int AIRinst = DataTypeConvertor.stringToInt("0001100000000001");
        // Create int representation of "SIR 0, 1"
        int SIRinst = DataTypeConvertor.stringToInt("0001110000000001");
        
        mem.setMem(7, LDRinst);
        mem.setMem(31, 65535);
        mem.setMem(8,LDXinst);
        mem.setMem(20, 100);
        mem.setMem(9,LDR2inst);
        mem.setMem(30, 31);
        mem.setMem(10,AMRinst);
        mem.setMem(124, 6000);
        mem.setMem(11,STRinst);
        mem.setMem(12,LDA3inst);
        mem.setMem(13,SMRinst);
        mem.setMem(14,AIRinst);
        mem.setMem(15,SIRinst);
        
        
        
        
    }
}
