/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import GUI.FrontPanel;
import Storage.*;

/**
 *
 * @author Aether
 */
public class CSCI6461_Project {

    static int memLength = 2048;
    /**
     * This class serves as an instantiator, creating other classes before
     * turning control over to the Executor class.
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Memory memory = new Memory(memLength);
        Part1MemorySetter.setMemory(memory);
        Registers registers = new Registers();
        FrontPanel GUI = new FrontPanel();
        Executor system = new Executor(registers, memory, GUI);
        //turn over execution to system
        system.start();
    }
    
}
