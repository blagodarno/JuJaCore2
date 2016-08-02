package ua.com.juja.lab34;

import java.math.BigInteger;

/**
 * Created by asu06 on 10.06.16.
 */
public class BigIntegerUtils {

    public static String toBitStr(BigInteger arg) {

        if(arg.toString().equals("1")){
            return "1";
        }
        if(arg.toString().equals("0")){
            return "0";
        }
        int length = arg.bitLength();
        String res = "";
        for (int i = length-1; i >=0; i--)
        {
            if(arg.testBit(i)){
              res=res+"1";
            }else {
                res=res+"0";
            }
        }
        return res;
    }

//    public static String toBitStr(BigInteger arg) {
//        String result = "";
//        BigInteger radix = new BigInteger(String.valueOf(2));
//
//        BigInteger quotient = arg;
//        BigInteger remainder = null;
//
//        do {
//            BigInteger[] divResult = quotient.divideAndRemainder(radix);
//            remainder = divResult[1];
//            quotient = divResult[0];
//
//            result = remainder.toString() + result;
//        } while (quotient.compareTo(radix) >= 0);
//
//        return quotient.toString() + result;
//    }

//    public static String toBitStr(BigInteger arg) {
//        String result = "";
//        BigInteger radix = new BigInteger(String.valueOf(2));
//
//        BigInteger quotient = null;
//        BigInteger remainder = arg;
//
//        BigInteger divider = new BigInteger("1");
//        while (divider.compareTo(remainder) <= 0) {
//            divider = divider.multiply(radix);
//        }
//
//        do {
//            divider = divider.divide(radix);
//
//            BigInteger[] divResult = remainder.divideAndRemainder(divider);
//            remainder = divResult[1];
//            quotient = divResult[0];
//
//            result = result + quotient.toString();
//        } while (divider.compareTo(radix) != 0);
//
//        return  result + remainder.toString();
//    }


}
