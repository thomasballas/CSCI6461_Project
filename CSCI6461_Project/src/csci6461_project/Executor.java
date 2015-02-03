/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import GUI.FrontPanel;
import Storage.Memory;
import Storage.Registers;
import Utilities.DataTypeConvertor;
import Utilities.Instructions;
import static java.lang.Thread.sleep;

/**
 *
 * @author Aether
 */
public class Executor {

    Memory mem;
    Registers reg;
    FrontPanel GUI;

    public Executor(Registers reg, Memory mem, FrontPanel gui) {
        this.mem = mem;
        this.reg = reg;
        this.GUI = gui;
    }

    private void guiUpdateBattery() {
        GUI.updateCCRegister(reg.getCC());
        GUI.updateGPRegister(0, reg.getGPR(0));
        GUI.updateGPRegister(1, reg.getGPR(1));
        GUI.updateGPRegister(2, reg.getGPR(2));
        GUI.updateGPRegister(3, reg.getGPR(3));
        GUI.updateXRegister(1, reg.getXR(1));
        GUI.updateXRegister(2, reg.getXR(2));
        GUI.updateXRegister(3, reg.getXR(3));
        GUI.updateIRRegister(reg.getIR());
        GUI.updateMARRegister(reg.getMAR());
        GUI.updateMBRRegister(reg.getMBR());
        GUI.updateMSRRegister(reg.getMSR());
        GUI.updateMFRRegister(reg.getMFR());
        GUI.updatePCRegister(reg.getPC());
    }

    public void start() throws InterruptedException {
        reg.setPC(7);
        System.out.println(reg.getPC());
        int LDRinst = DataTypeConvertor.stringToInt("0000011100111111");
        mem.setMem(7, LDRinst);
        mem.setMem(31, 31);
        System.out.println("Started");
        Instructions inst = new Instructions(mem, reg);
        guiUpdateBattery();
        while (reg.getPC() < mem.getMemoryLength()) {
            while ((GUI.run == false) && (GUI.singleStep == false)) {
                sleep(50);
            }
            reg.setMAR(reg.getPC());
            reg.setMBR(mem.getMem(reg.getMAR()));
            reg.setIR(reg.getMBR());
            inst.executeInstruction(reg.getIR());
//
//            int isoInst[] = inst.isolateLoadStoreBits(reg.getIR());
//            int effectiveAddress = inst.computeEA(isoInst[2], isoInst[3], isoInst[4]);
//            reg.setMAR(effectiveAddress);
//            
//            GUI.updateGPRegister(0, 26);
//            GUI.updateGPRegister(1, 19);

            GUI.singleStep = false;
            reg.setPC(reg.getPC() + 1);
            System.out.println("Program counter is now " + reg.getPC());
            guiUpdateBattery();

        }
    }

}
