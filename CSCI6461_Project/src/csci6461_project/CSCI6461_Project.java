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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DisplayController display = new DisplayController();
        Memory memory = new Memory();
        Registers registers = new Registers();
        sleep(1500);
        registers.setGPR(0, 1);
        display.updateGPR(0, 1);
        sleep(1500);
        registers.setGPR(1, 2);
        display.updateGPR(1, 2);
        sleep(1500);
        registers.setGPR(2, 4);
        display.updateGPR(2, 4);
        sleep(1500);
        registers.setGPR(3, 8);
        display.updateGPR(3, 8);
        System.out.println("Got to the end of this thing.");
        for (int i = 0; i < 4; i++){
            int value = registers.getGPR(i);
            System.out.println("Value of GPR" + i + " is " + value);
        }
    }
    
}
