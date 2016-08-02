package ua.com.juja.lab33;

import java.math.BigInteger;

/**
 * Created by asu06 on 10.06.16.
 */
public class Runner {
    public static void main(String[] args) {
        BigInteger [] first = new BigInteger[2];
        first[0] = BigInteger.valueOf(4);
        first[1] = BigInteger.valueOf(40);

        BigInteger [] second = new BigInteger[2];
        second[0] = BigInteger.valueOf(2);
        second[1] = BigInteger.valueOf(5);

        BigInteger [] res = FractionUtils.sum(first,second);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
