package ua.com.juja.lab34;

import ua.com.juja.lab33.FractionUtils;

import java.math.BigInteger;

/**
 * Created by asu06 on 10.06.16.
 */
public class Runner {
    public static void main(String[] args) {
        BigInteger var1 = new BigInteger("2");
        BigInteger var2 = new BigInteger("8");
        BigInteger var3 = new BigInteger("10");
        BigInteger var4 = new BigInteger("140");
        BigInteger var5 = new BigInteger("0");
        BigInteger var6 = new BigInteger("1");

        //int bit = var4.bitLength();
        //System.out.println(bit);

        //String res = BigIntegerUtils.toBitStr(var1);


        System.out.println(BigIntegerUtils.toBitStr(var1));
        System.out.println(BigIntegerUtils.toBitStr(var2));
        System.out.println(BigIntegerUtils.toBitStr(var3));
        System.out.println(BigIntegerUtils.toBitStr(var4));
        System.out.println(BigIntegerUtils.toBitStr(var5));
        System.out.println(BigIntegerUtils.toBitStr(var6));

    }
}
