package ua.com.juja.lab33;

import java.math.BigInteger;
/**
 * Created by asu06 on 10.06.16.
 */
public class FractionUtils {

//    public FractionUtils(BigInteger[] first, BigInteger[] second) {
//
//    }

    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {

        BigInteger [] res = new BigInteger[2];

        BigInteger lcm = leastCommonMultiple(x[1],y[1]);
        BigInteger mulX = lcm.divide(x[1]);
        BigInteger mulY = lcm.divide(y[1]);
        BigInteger x0 = x[0].multiply(mulX);
        BigInteger y0 = y[0].multiply(mulY);
        BigInteger sum0 = x0.add(y0);

        BigInteger commonDivide = sum0.gcd(lcm);
        if (!commonDivide.equals(1)){
            res[0] = sum0.divide(commonDivide);
            res[1] = lcm.divide(commonDivide);
        }else {
            res[0] = sum0;
            res[1] = lcm;
        }
        return res;

    }

    public static BigInteger leastCommonMultiple( BigInteger a , BigInteger b ) {
        BigInteger c = a.gcd( b ) ;
        return a.multiply( b.divide( c ) ) ;
    }
}
