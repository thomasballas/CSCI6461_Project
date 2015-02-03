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
            
    public DisplayController(Executor system) {
//        display = new FrontPanel(system);
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
    
    public void updateIR(int value)
    {
        display.updateIRRegister(value);
    }
    
    public void updateMAR(int value)
    {
        display.updateMARRegister(value);
    }
    
    public void updateMBR(int value)
    {
        display.updateMBRRegister(value);
    }
    
    public void updateMSR(int value)
    {
        display.updateMSRRegister(value);
    }
    
    public void updateMFR(int value)
    {
        display.updateMFRRegister(value);
    }
    
    public void updateCC(int value)
    {
        display.updateCCRegister(value);
    }
    
    public void updatePC(int value)
    {
        display.updatePCRegister(value);
    }
    
    
    
    
}
