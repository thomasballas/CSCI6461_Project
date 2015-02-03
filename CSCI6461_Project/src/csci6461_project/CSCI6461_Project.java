/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import GUI.FrontPanel;
import static java.lang.Thread.sleep;
import Storage.*;

/**
 *
 * @author Aether
 */
public class CSCI6461_Project {

    static int memLength = 2048;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Memory memory = new Memory(memLength);
        Registers registers = new Registers();
        FrontPanel GUI = new FrontPanel();
        Executor system = new Executor(registers, memory, GUI);
        system.start();

//        sleep(500);
//        registers.setGPR(0, 1);
//        GUI.updateGPRegister(0, 1);
//        sleep(500);
//        registers.setGPR(1, 2);
//        GUI.updateGPRegister(1, 2);
//        sleep(500);
//        registers.setGPR(2, 4);
//        GUI.updateGPRegister(2, 4);
//        sleep(500);
//        registers.setGPR(3, 8);
//        GUI.updateGPRegister(3, 8);
//        GUI.updatePrinter("Finished updating GPRs.");
//        sleep(500);
//        registers.setXR(1, 2);
//        GUI.updateXRegister(1, 2);
//        sleep(500);
//        registers.setXR(2, 4);
//        GUI.updateXRegister(2, 4);
//        sleep(500);
//        registers.setXR(3, 8);
//        GUI.updateXRegister(3, 8);
//        GUI.updatePrinter("Finished updating XRs.");
//        sleep(500);
//        registers.setCC(7);
//        GUI.updateCCRegister(7);
//        GUI.updatePrinter("Finished updating CC.");
//        sleep(500);
//        registers.setPC(7);
//        GUI.updatePCRegister(7);
//        GUI.updatePrinter("Finished updating PC.");
//        sleep(500);
//        registers.setMAR(7);
//        GUI.updateMARRegister(7);
//        GUI.updatePrinter("Finished updating MAR.");
//        sleep(500);
//        registers.setMBR(7);
//        GUI.updateMBRRegister(7);
//        GUI.updatePrinter("Finished updating MBR.");
//        sleep(500);
//        registers.setMSR(7);
//        GUI.updateMSRRegister(7);
//        GUI.updatePrinter("Finished updating MSR.");
//        sleep(500);
//        registers.setMFR(7);
//        GUI.updateMFRRegister(7);
//        GUI.updatePrinter("Finished updating MFR.");
//        sleep(500);
//        registers.setIR(7);
//        GUI.updateIRRegister(7);
//        GUI.updatePrinter("Finished updating IR.");
//        sleep(500);
//        GUI.updatePrinter("We are reaching the end\n of this program.");
//        System.out.println("Got to the end of this thing.");
//        for (int i = 0; i < 4; i++){
//            int value = registers.getGPR(i);
//            System.out.println("Value of GPR" + i + " is " + value);
//        }
//        for (int i = 0; i < 3; i++){
//            int value = registers.getXR(i);
//            System.out.println("Value of GPR" + i + " is " + value);
//        }
    }
    
}
