/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import Storage.Memory;
import Storage.Registers;
import Utilities.DataTypeConvertor;

/**
 *
 * @author Aether
 */
public class Part4MemorySetter {
    public static void setReg(Registers reg) {
        reg.setFR(0, 13.375);
        reg.setFR(1, -0.00168);
    }
    public static void setMemory(Memory mem) {
        // Create int representation of "STFR 0, 0, 16"
        int STFRinst = DataTypeConvertor.stringToInt("1010010000010000");
        // Create int representation of "STFR 1, 0, 17"
        int STFR2inst = DataTypeConvertor.stringToInt("1010010100010001");
        // Create int representation of "FADD 1, 0, 10"
        int FADDinst = DataTypeConvertor.stringToInt("0110110100001010");
        // Create int representation of "FSUB 0, 0, 10"
        int FSUBinst = DataTypeConvertor.stringToInt("0111000000001010"); 
        // Create int representation of "LDFR 0, 0, 16"
        int LDFRinst = DataTypeConvertor.stringToInt("1010000000010000");
        // Create int representation of "LDFR 1, 0, 17"
        int LDFR2inst = DataTypeConvertor.stringToInt("1010000100010001");
        // Create int representation of "STR 2, 0, 29"
        
        mem.setMem(10, 100);
        mem.setMem(32, STFRinst);
        mem.setMem(33, STFR2inst);
        mem.setMem(34,FADDinst);
        mem.setMem(35,FSUBinst);
        mem.setMem(36,LDFRinst);
        mem.setMem(37,LDFR2inst);

        
        
        
        
    }
}
