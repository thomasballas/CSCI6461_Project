/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci6461_project;

import Storage.Memory;
import Storage.Registers;

/**
 *
 * @author Aether
 */
public class MemoryController {
    
    Memory memory;
    Registers registers;
    
    public MemoryController()
    {
        memory = new Memory();
        registers = new Registers();
    }
    
    
}
