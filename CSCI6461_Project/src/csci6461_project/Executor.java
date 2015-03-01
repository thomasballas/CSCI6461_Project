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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Thread.sleep;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    /***
     * Updates GUI to reflect changes in registers.
     * Only makes changes if flags have been set via register setter methods.
     */
    private void guiUpdateBattery() {
        if (reg.GPR_changed[0]) GUI.updateGPRegister(0, reg.getGPR(0));
        if (reg.GPR_changed[1]) GUI.updateGPRegister(1, reg.getGPR(1));
        if (reg.GPR_changed[2]) GUI.updateGPRegister(2, reg.getGPR(2));
        if (reg.GPR_changed[3]) GUI.updateGPRegister(3, reg.getGPR(3));
        if (reg.XR_changed[0]) GUI.updateXRegister(1, reg.getXR(1));
        if (reg.XR_changed[1]) GUI.updateXRegister(2, reg.getXR(2));
        if (reg.XR_changed[2]) GUI.updateXRegister(3, reg.getXR(3));
        if (reg.IR_changed) GUI.updateIRRegister(reg.getIR());
        if (reg.MAR_changed) GUI.updateMARRegister(reg.getMAR());
        if (reg.MBR_changed) GUI.updateMBRRegister(reg.getMBR());
        if (reg.MSR_changed) GUI.updateMSRRegister(reg.getMSR());
        if (reg.MFR_changed) GUI.updateMFRRegister(reg.getMFR());
        if (reg.PC_changed) GUI.updatePCRegister(reg.getPC());
        if (reg.CC_changed) GUI.updateCCRegister(reg.getCC());
        if (reg.Carry_changed) GUI.updateCarry(reg.getCarry());
        GUI.resetChangedFlags();
        reg.resetChangedFlags();
    }
    
    private void guiPollBattery() {
        if (GUI.changed) {
            if (GUI.GPR_changed[0]) reg.setGPR(0, GUI.getGPRegister(0));
            if (GUI.GPR_changed[1]) reg.setGPR(1, GUI.getGPRegister(1));
            if (GUI.GPR_changed[2]) reg.setGPR(2, GUI.getGPRegister(2));
            if (GUI.GPR_changed[3]) reg.setGPR(3, GUI.getGPRegister(3));
            if (GUI.XR_changed[0]) reg.setXR(1, GUI.getXRegister(1));
            if (GUI.XR_changed[1]) reg.setXR(2, GUI.getXRegister(2));
            if (GUI.XR_changed[2]) reg.setXR(3, GUI.getXRegister(3));
            if (GUI.IR_changed) reg.setIR(GUI.getIRRegister());
            if (GUI.MAR_changed) reg.setMAR(GUI.getMARRegister());
            if (GUI.MBR_changed) reg.setMBR(GUI.getMBRRegister());
            if (GUI.MSR_changed) reg.setMSR(GUI.getMSRRegister());
            if (GUI.MFR_changed) reg.setMFR(GUI.getMFRRegister());
            if (GUI.CC_changed) reg.setCC(GUI.getCCRegister());
            if (GUI.PC_changed) reg.setPC(GUI.getPCRegister());
        }
        GUI.resetChangedFlags();
        reg.resetChangedFlags();
    }

    private void parseProgram(File programFile) {
        try {
            Scanner sc = new Scanner(programFile);
            Vector<Integer> vc = new Vector<>();
            while (sc.hasNext()) {
                String next = sc.next();
                int inst = DataTypeConvertor.stringToInt(next);
                vc.add(inst);
                System.out.println("Parsed file line containing " + next);
                System.out.println("Converted line into " + inst);
                
            }
            Integer[] hold = vc.toArray(new Integer[0]);
//            System.out.println(hold.length);
            int[] hold2 = new int[hold.length];
            for (int i = 0; i<hold.length; i++) hold2[i] = hold[i];
//            System.out.println(hold2.length);
            mem.writeMem(hold2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Executor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("FILE READ ERROR: CANNOT PARSE PROGRAM");
        }
        
    }
    /***
     * start() runs continuously, executing instructions from memory
     * it will wait until a user selects run or single step
     * if a user selects halt, it will begin waiting again
     */
    public void start() throws InterruptedException {
        //set PC to first unallocated space
//        System.out.println(reg.getPC());
        System.out.println("Started");
        Instructions inst = new Instructions(mem, reg);
        guiUpdateBattery();
        while (true) {
            while (((GUI.run == false) && (GUI.singleStep == false)) ||  
                    (reg.getPC() >= mem.getMemoryLength()) || 
                    (reg.getPC() < 6)){
                sleep(50);
                if (GUI.IPL) {
                    if (GUI.setFile) parseProgram(GUI.programFile);
                    else Part1MemorySetter.setMemory(mem);
                    reg.setPC(7);
                    GUI.IPL = false;
                    GUI.run = false;
                    GUI.singleStep = false;
                    guiUpdateBattery();
                    mem.printCache();
                }
            }
            guiPollBattery();
            reg.setCarry(0);
            reg.setCC(0);
            reg.setMAR(reg.getPC());
            reg.setMBR(mem.getMem(reg.getMAR()));
            reg.setIR(reg.getMBR());
            inst.executeInstruction(reg.getIR());

            GUI.singleStep = false;
            //GUI.IPL = false;
            reg.setPC(reg.getPC() + 1);
//            System.out.println("Program counter is now " + reg.getPC());
            guiUpdateBattery();
        }
    }

}
