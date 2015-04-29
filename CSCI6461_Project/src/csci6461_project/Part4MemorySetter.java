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
        reg.setFR(0, 2.375);
        reg.setFR(1, -0.00168);
        reg.setGPR(2, 0);
        reg.setGPR(1, 1);
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
        // Create int representation of "CNVRT 2, 0, 16"
        int CNVRTinst = DataTypeConvertor.stringToInt("0111111000010000");
        // Create int representation of "CNVRT 1, 0, 10"
        int CNVRT2inst = DataTypeConvertor.stringToInt("0111110100001010");
        // Create int representation of "VADD 0, 0, 8"
        int VADDinst = DataTypeConvertor.stringToInt("0111010000001000");
        // Create int representation of "VSUB 0, 0, 8"
        int VSUBinst = DataTypeConvertor.stringToInt("0111100000001000");
        
        
        mem.setMem(8, 12);
        mem.setMem(9, 14);
        mem.setMem(10, 100);
        mem.setMem(12, 100);
        mem.setMem(13, 100);
        mem.setMem(14, 22);
        mem.setMem(15, 66);
        mem.setMem(32, STFRinst);
        mem.setMem(33, STFR2inst);
        mem.setMem(34,FADDinst);
        mem.setMem(35,FSUBinst);
        mem.setMem(36,LDFRinst);
        mem.setMem(37,LDFR2inst);
        mem.setMem(38,CNVRTinst);
        mem.setMem(39,CNVRT2inst);
        mem.setMem(40,LDFRinst);
        mem.setMem(41,VADDinst);
        mem.setMem(42,VSUBinst);

        
        
        
        
    }
}
