package ua.com.juja.lab35;

import java.math.BigInteger;

/**
 * Created by asu06 on 12.06.16.
 */
public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = new BigInteger(String.valueOf(0));
        for (int i = 0; i < poly.length ; i++) {
            result=result.add(poly[i].multiply(arg.pow(poly.length-1-i)));
        }
        
        return result;
    }

    public static BigInteger[] mul (BigInteger[] x, BigInteger[] y) {
        int res_length = x.length+y.length;
        BigInteger [] result = new BigInteger[res_length];
        BigInteger tmp = new BigInteger(String.valueOf("0"));
        if (x.length<y.length){
            BigInteger [] smaller = x;
        }else {
            BigInteger [] smaller = y;
        }

        for (int i = 0; i < res_length; i++) {

                result[i]=x[i].multiply(y[i]).add(tmp);
                if(i<x.length-1){
                    tmp = x[i].multiply(y[i+1]);
                }

        }
        return result;
    }
}
