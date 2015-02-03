/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import GUI.FrontPanel;
import Storage.Memory;
import Storage.Registers;
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
    
    public void start() throws InterruptedException {
        System.out.println ("Started");
        while ((GUI.run == false) && (GUI.singleStep == false)) sleep(50);
        System.out.println("User has attempted something.");
    }
    
}
