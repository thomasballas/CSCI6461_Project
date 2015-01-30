/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import GUI.FrontPanel;

/**
 *
 * @author Aether
 */
public class DisplayController {
    
    FrontPanel display;
            
    public DisplayController() {
        display = new FrontPanel();
    }
    
    public String getConsoleInput()
    {
        return display.getConsoleInput();
    }
        
    public void updatePrinter(String output)
    {
        display.updatePrinter(output);
    }
    
    public void updateGPR(int rNum, int value)
    {
        display.updateGPRegister(rNum, value);
    }
    
    public void updateXR(int xNum, int value)
    {
        display.updateXRegister(xNum, value);
    }
    
}
