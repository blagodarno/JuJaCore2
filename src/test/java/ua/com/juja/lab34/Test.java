package ua.com.juja.lab34;
import java.math.BigInteger;
/**
 * Created by asu06 on 10.06.16.
 */
    public class Test {
        public static void main(String[] args) {
            BigInteger k = new BigInteger("2");
            String expected = "10";
            String actual = BigIntegerUtils.toBitStr(k);

            if (!expected.equals(actual)) {
                throw new AssertionError();
            }

            System.out.print("OK");
        }
    }

