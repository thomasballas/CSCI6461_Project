/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

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
        DisplayController display = new DisplayController();
        Memory memory = new Memory(memLength);
        Registers registers = new Registers();
        sleep(500);
        registers.setGPR(0, 1);
        display.updateGPR(0, 1);
        sleep(500);
        registers.setGPR(1, 2);
        display.updateGPR(1, 2);
        sleep(500);
        registers.setGPR(2, 4);
        display.updateGPR(2, 4);
        sleep(500);
        registers.setGPR(3, 8);
        display.updateGPR(3, 8);
        display.updatePrinter("Finished updating GPRs.");
        sleep(500);
        registers.setXR(1, 2);
        display.updateXR(1, 2);
        sleep(500);
        registers.setXR(2, 4);
        display.updateXR(2, 4);
        sleep(500);
        registers.setXR(3, 8);
        display.updateXR(3, 8);
        display.updatePrinter("Finished updating XRs.");
        sleep(500);
        registers.setCC(7);
        display.updateCC(7);
        display.updatePrinter("Finished updating CC.");
        sleep(500);
        registers.setPC(7);
        display.updatePC(7);
        display.updatePrinter("Finished updating PC.");
        sleep(500);
        registers.setMAR(7);
        display.updateMAR(7);
        display.updatePrinter("Finished updating MAR.");
        sleep(500);
        registers.setMBR(7);
        display.updateMBR(7);
        display.updatePrinter("Finished updating MBR.");
        sleep(500);
        registers.setMSR(7);
        display.updateMSR(7);
        display.updatePrinter("Finished updating MSR.");
        sleep(500);
        registers.setMFR(7);
        display.updateMFR(7);
        display.updatePrinter("Finished updating MFR.");
        sleep(500);
        registers.setIR(7);
        display.updateIR(7);
        display.updatePrinter("Finished updating IR.");
        sleep(500);
        display.updatePrinter("We are reaching the end\n of this program.");
        System.out.println("Got to the end of this thing.");
        for (int i = 0; i < 4; i++){
            int value = registers.getGPR(i);
            System.out.println("Value of GPR" + i + " is " + value);
        }
        for (int i = 0; i < 3; i++){
            int value = registers.getXR(i);
            System.out.println("Value of GPR" + i + " is " + value);
        }
    }
    
}
