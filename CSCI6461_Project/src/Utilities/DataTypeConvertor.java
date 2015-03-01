package Utilities;

public class DataTypeConvertor {
	
    //convert binary string representations to integers
    public static int stringToInt(String s){
        int result=0;

        for(int i = s.length()-1; i >= 0; i--){
            //Calculate the multiplier value
            int multiplier = (int) Math.pow(2, s.length()-i-1);
            //isolate the bit in the string
            int placeVal = Integer.parseInt(String.valueOf(s.charAt(i)));
            //multiply the bit value by its multiplier
            result += placeVal * multiplier;
        }
        return result;
    }

    //convert integers into variable bit binary strings
    public static String intToString(int i, int bitsize){
        //convert integer to binary string
        String value = Integer.toBinaryString(i);
        // pad with 0s to make user-supplied size bits
        String formatter = "%" + bitsize + "s";
        return String.format(formatter, value).replace(' ', '0');
    }
    
    
    
    public static void main (String[] args)
    {
        String bin = intToString(15, 16);
        System.out.println(bin);
        System.out.println(stringToInt(bin));

    }

}
