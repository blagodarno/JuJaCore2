package ua.com.juja.lab35;

import ua.com.juja.lab35.PolyUtils;

import java.math.BigInteger;
import java.nio.channels.Pipe;

/**
 * Created by asu06 on 12.06.16.
 */
public class Test {
        public static void main(String[] args) {
            BigInteger [] test = {new BigInteger("2"),new BigInteger("0"),new BigInteger("-3"),new BigInteger("0")};
            BigInteger point = new BigInteger("100");
            BigInteger expected = new BigInteger("1999700");
//            System.out.println(test[0]);
//            System.out.println(test[1]);
//            System.out.println(test[2]);
//            System.out.println(test[3]);
//            System.out.println(test.length);
            BigInteger actual = PolyUtils.eval(test,point);

            if (!expected.equals(actual)) {
                throw new AssertionError();
            }

            System.out.print("OK");
        }
    }



