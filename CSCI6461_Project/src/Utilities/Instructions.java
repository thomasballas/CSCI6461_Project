/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Aether
 */
public class Instructions {
    
    
    	Memory mem;
	Registers reg;
	
	public Instructions (Memory mem,Registers reg){
		this.mem=mem;
		this.reg=reg;
	}
	
	public int computeEA(int I, int IX,int Address){
		if(I==0){
			if(IX==0)
				return Address;
			if(IX==1||IX==2||IX==3)
				return reg.getXR(IX)+Address;
		}
		else if(I==1){
			if(IX==00)
				return mem.getMem(Address);
			if(IX==1||IX==2||IX==3)
				return mem.getMem(reg.getXR(IX)+Address);
		}	
		
		return -1;
	}
	
	public void decoder(String insBinary){

		Memory mem = new Memory();
		Registers reg = new Registers();

		
		String Opcode = insBinary.substring(0,6);
		
		int R,IX,I,Address, EA;
		R = DataTypeConvertor.stringToInt(insBinary.substring(6,8));
		IX = DataTypeConvertor.stringToInt(insBinary.substring(8,10));
		I = DataTypeConvertor.stringToInt(insBinary.substring(10));
		Address = DataTypeConvertor.stringToInt(insBinary.substring(11,16));
		
		
		switch (Opcode) {
		
		//Load and Store instruction block
		case "000001": //instruction for LDR
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				reg.setGPR(R, mem.getMem(EA));
			}
			else 
				System.out.println("error");
					
			break;
		
		case "000010": //instruction for STR
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				mem.setMem(EA, reg.getGPR(R));
			}
			else 
				System.out.println("error");
										
			break;
			
		case "000011": //instruction for LDA
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				reg.setGPR(R, EA);
			}
			else 
				System.out.println("error");
							
			break;
			
		case "101010": //instruction for LDX
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				reg.setXR(R, mem.getMem(EA));
			}
			else 
				System.out.println("error");
							
			break;
			
		case "101011": //instruction for STX
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				mem.setMem(EA, reg.getXR(R));
			}
			else 
				System.out.println("error");
							
			break;
			
		
			//Transfer instruction block
		case "001010": //instruction for JZ
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				if(reg.getGPR(R)==1)
					reg.setPC(EA);
				else
					reg.setPC(reg.getPC()+1);
			}
			else 
				System.out.println("error");
							
			break;
			
		
			
		case "001011": //instruction for JNE
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				if(reg.getGPR(R)!=0)
					reg.setPC(EA);
				else
					reg.setPC(reg.getPC()+1);
			}
			else 
				System.out.println("error");
							
			break;	
			
		case "001100": //instruction for JCC
			
			EA = computeEA(I, IX, Address);
			if(EA!=-1&&EA<=2048){
				if(reg.getCC())
					reg.setPC(EA);
				else
					reg.setPC(reg.getPC()+1);
			}
			else 
				System.out.println("error");
							
			break;	
			
		default:
			break;
		}
	}
	

    
    
    public static void LoadRegisterFromMemory(int rNum, int xNum, int addr)
    {
        
        
    }
    public static void StoreRegisterToMemory(int rNum, int xNum, int addr)
    {
        
        
    }
    public static void LoadRegisterWithAddress(int rNum, int xNum, int addr)
    {
        
        
    }
    public static void LoadIndexRegisterFromMemory(int x1Num, int x2Num, int addr)
    {
        
        
    }
    public static void StoreIndexRegisterToMemory(int x1Num, int x2Num, int addr)
    {
        
        
    }
}
