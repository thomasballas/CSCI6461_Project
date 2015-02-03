//package Utilities;
//
//public class InstructionTranslator {
//	static String insPseudo;
//	
//	
//	//take one line of pseudo code as input, like "LDR 21,31..."
//	public InstructionTranslator(String aString) {
//		this.insPseudo = aString;
//	}
//	
//	//split each part of assembly code by ",", and ignore all the spaces between.
//	public static String[] tokens(String aString){
//
//		
//	
//
//		int sections=1;
//		int flag = 0;
//
//		
//		for(int i=0;i<aString.length();i++){
//			if(aString.charAt(i)==','){
//				sections++;
//			}
//		}
//		
//		if(aString.contains("I")&&aString.contains("=")){
//			sections++;
//			flag=1;
//		}
//		
//		String[] result = new String[5];
//		
//		//initialize the string array, make sure the content as "" instead of null, to avoid the result like "null12" 
//		for(int i=0;i<result.length;i++)
//			result[i]="";
//		
//		int opLength=0;
//
//		
//		for(int i=0; i<aString.length();i++){
//			if(aString.charAt(i)==' '){
//				break;
//			}
//			opLength++;
//			result[0]+=aString.charAt(i);
//
//
//		}
//		
//		for(int i=opLength, j=1;i<aString.length();i++){
//			if(aString.charAt(i)!=' '&&aString.charAt(i)!=',')
//				result[j]+=aString.charAt(i);
//	
//				
//			else if(aString.charAt(i)==',')
//				j++;
//			
//			else if(aString.charAt(i)==' ')
//				if(flag==1&&j==sections-1&&aString.charAt(i-1)!=','&&aString.charAt(i-1)!=' ')
//					j++;
//				else 
//					continue;
//			
//		}
//		
//		
//		return result;
//	}
//	
//	
//	//a static method to translate each of the assembly instruction into binary code 
//	public String translator(){
//		String[] tokens = tokens(insPseudo);
//		String R = "";
//		String IX="";
//		String I="";
//		String Address=" ";
//		String op = tokens[0].toUpperCase();
//		
//		if(tokens[1]!=""){
//			R = DataTypeConvertor.intToString(Integer.valueOf(tokens[1]));
//			R=String.format("%2s", R).replace(' ', '0');
//			
//		}
//
//		if(tokens[2]!=""){
//			IX = DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
//			IX=String.format("%2s", IX).replace(' ', '0');
//		}
//
//		if(tokens[4]!=""){
//			I ="";
//			if(tokens.length==5){
//				if(tokens[4].contains("1"))
//					I = "1";
//			}
//			else {
//				I = "0";
//			}
//		}
//
//		
//		if(tokens[4]!=""){
//			Address = DataTypeConvertor.intToString(Integer.valueOf(tokens[3]));
//			Address=String.format("%5s", Address).replace(' ', '0');
//		}
//
//		
//
//
//
//
//		
//		switch (op) {
//		case "LDR":
//			return "000001"+R+IX+I+Address;
//			
//		case "STR":
//			return "000010"+R+IX+I+Address;
//			
//		case "LDA":
//			return "000011"+R+IX+I+Address;
//			
//		case "LDX":
//			return "100001"+R+IX+I+Address;
//			
//		case "STX":
//			return "100010"+R+IX+I+Address;
//			
//		case "AMR":
//			return "000100"+R+IX+I+Address;
//			
//		case "SMR":
//			return "000101"+R+IX+I+Address;
//			
//		case "AIR":
//			
//			String airAdress =  DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
//			airAdress=String.format("%5s", airAdress).replace(' ', '0');
//			return "000110"+R+"00"+"0"+airAdress;
//			
//		case "SIR":
//			String sirAdress =  DataTypeConvertor.intToString(Integer.valueOf(tokens[2]));
//			sirAdress=String.format("%5s", sirAdress).replace(' ', '0');
//			return "000111"+R+"00"+"0"+sirAdress;
//			
//		default:
//			return null;
//		}
//	}
//	
//	public static void main(String args[]){
//		System.out.println(tokens("LDR 3,0,31 w/I=1")[3]);
//		InstructionTranslator in = new InstructionTranslator("LDR 3,0,31 w/I=1");
//		System.out.println(in.translator());
//		InstructionTranslator in1 = new InstructionTranslator("AIR 3,31");
//		System.out.println(in1.translator());
//
//	}
//	
//}
