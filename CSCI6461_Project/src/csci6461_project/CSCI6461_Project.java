/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import static java.lang.Thread.sleep;

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
        DisplayController myDisplay = new DisplayController();
        sleep(3000);
        myDisplay.updateGPR(0, 1);
        sleep(3000);
        myDisplay.updateGPR(1, 2);
        sleep(3000);
        myDisplay.updateGPR(2, 4);
        sleep(3000);
        myDisplay.updateGPR(3, 8);
        System.out.println("Got to the end of this thing.");
    }
    
}
