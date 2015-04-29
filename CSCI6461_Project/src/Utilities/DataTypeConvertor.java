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
    
    public static int FloatToIntRep(double theFloat) {
        int returns = 0;
        returns = stringToInt(generateFloatingPointRepFromDouble(theFloat));
        return returns;
    }
    
    public static double intToFloat(int theFloat) {
        double returns = 0;
        returns = generateDoubleFromFloatingPointRep(intToString(theFloat,16));
        return returns;
    }
            
    public static float generateDoubleFromFloatingPointRep(String theFloat) {
        if (theFloat.length() < 16) {
            return 0;
        }
        double returnVal = 0;
        String signBit = theFloat.substring(0, 1);
        String exponentBits = theFloat.substring(1, 8);
        String mantissaBits = theFloat.substring(8, 16);
        if (DataTypeConvertor.stringToInt(mantissaBits) == 0) return 0;
        int sign = DataTypeConvertor.stringToInt(signBit);

        int exponent = 64 - DataTypeConvertor.stringToInt(exponentBits);
        mantissaBits = "1" + mantissaBits;
        int intega = 0;
        double frac = 0;

        if (exponent >= 0) {
            if (exponent > 8) {
                returnVal = DataTypeConvertor.stringToInt(mantissaBits) << (exponent - 8);
            } else {
                intega = DataTypeConvertor.stringToInt(mantissaBits.substring(0, exponent + 1));
                String fracBits = mantissaBits.substring(exponent + 1, mantissaBits.length());
                double mult = 0.5;
                for (int i = 0; i < fracBits.length(); i++) {
                    if (fracBits.charAt(i) == '1') {
                        frac += mult;
                    }
                    mult *= 0.5;
                }
                returnVal = intega + frac;
            }
        } else {
            exponent = -exponent;
            for (int i = 0; i < exponent - 1; i++) {
                mantissaBits = "0" + mantissaBits;
            }
            double mult = 0.5;
            for (int i = 0; i < mantissaBits.length(); i++) {
                if (mantissaBits.charAt(i) == '1') {
                    frac += mult;
                }
                mult *= 0.5;
            }
            returnVal = frac;
        }

        if (sign != 0) {
            returnVal = -returnVal;
        }
        return (float) returnVal;
    }

    public static String generateFloatingPointRepFromDouble(double theFloat) {

        int sign = 0;
        if (theFloat < 0) {
            sign = 1;
            theFloat = -theFloat;
        }

        int exponSign = 1;
        int integ = (int) (theFloat / 1);
        int intega = integ;
        String intbits = "";
        if (integ == 0) {
            intbits = "0";
            if (theFloat == 0) exponSign = 0;
        } else {
            exponSign = 0;
            while (intega != 0) {
                if ((intega & 1) == 1) {
                    intbits = "1" + intbits;
                } else {
                    intbits = "0" + intbits;
                }
                intega = intega >> 1;
            }
        }

        double frac = theFloat % 1;
        double fraca = frac;
        String fracBits = "";
        while ((frac != 0) && (fracBits.length() < 64)) {
            frac *= 2;
            if (frac >= 1) {
                fracBits += "1";
                frac -= 1;
            } else {
                fracBits += "0";
            }
        }

        System.out.println("The value of the integer is " + integ);
        System.out.println("The bitstring of the integer is " + intbits);
        System.out.println("The value of the fraction is " + fraca);
        System.out.println("The bitstring of the fraction is " + fracBits);
        System.out.println("The bitstring of the double is " + intbits + "." + fracBits);

        int exponent = 0;
        String mantissaPointBits = "";
        if (exponSign == 0) {
            exponent = intbits.length() - 1;
            mantissaPointBits = intbits.substring(0, 1) + intbits.substring(1, intbits.length()) + fracBits;
        } else {
            while ((exponent-1 < fracBits.length()) && (fracBits.charAt(exponent) != '1')) {
                exponent += 1;
            }
            mantissaPointBits = fracBits.substring(exponent, exponent + 1) + fracBits.substring(exponent + 1, fracBits.length());
            exponent += 1;
            exponent = -exponent;
        }
        while (mantissaPointBits.length() < 9) {
            mantissaPointBits += "0";
        }
        exponent = 64 - exponent;
        String exponentBits = DataTypeConvertor.intToString(exponent, 7);
        String signBit = DataTypeConvertor.intToString(sign, 1);
        System.out.println("The bitstring of the float is " + mantissaPointBits);
        System.out.println("The exponent of the float is " + exponent);
        String floatingPointRep = signBit + exponentBits + mantissaPointBits.substring(1, 9);
        return floatingPointRep;
    }

    public static void main (String[] args)
    {
        String bin = intToString(15, 16);
        System.out.println(bin);
        System.out.println(stringToInt(bin));

    }

}
