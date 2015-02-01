package Utilities;

public class InstructionTranslator {
	static String insPseudo;
	
	
	//take one line of pseudo code as input, like "LDR 21,31..."
	public InstructionTranslator(String aString) {
		this.insPseudo = aString;
	}
	
	//split each part of assembly code by ",", and ignore all the spaces between.
	public static String[] tokens(String aString, int fields){
		String[] result = new String[fields];
		
		//initialize the string array, make sure the content as "" instead of null, to avoid the result like "null12" 
		for(int i=0;i<fields;i++)
			result[i]="";
		
		for(int i=0, j=0;i<aString.length();i++){
			if(aString.charAt(i)!=' '&&aString.charAt(i)!=',')
				result[j]+=aString.charAt(i);
			else if(aString.charAt(i)==' ')
				continue;
			else if(aString.charAt(i)==',')
				j++;
		}
		return result;
	}
	
	
	//a static method to translate each of the assembly instruction into binary code 
	public static String translator(){
		String op = insPseudo.substring(0,3);
		switch (op.toUpperCase()) {
		case "LDR":
			String binary = null;
			String Opcode, R, IX, I, Address;
			Opcode = "000001";
			
			String[] tokens = tokens(insPseudo.substring(4),3);
			
			R = DataTypeConvertor.intToString(Integer.valueOf(tokens[0]));
			IX = DataTypeConvertor.intToString(Integer.valueOf(tokens[1]));
			I = "1";
			Address = DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
			
			binary = Opcode+R+IX+I+Address;
			
			return binary;
			

		default:
			return null;
		}
	}
	

	
}
