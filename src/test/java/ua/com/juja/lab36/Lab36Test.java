package ua.com.juja.lab36;

import org.junit.Assert;
import org.junit.Test;
import ua.com.juja.lab35.PolyUtils;

import java.math.BigInteger;

import static org.junit.Assert.fail;

/**
 * Created by asu06 on 12.06.16.
 */
public class Lab36Test {


    @Test
    public void testUpDown_whenArraySizeIs0() {
        // given

        BigInteger[] f1= {new BigInteger("10"),new BigInteger("0"),new BigInteger("1")};
        BigInteger[] f2= {new BigInteger("-1"),new BigInteger("0")};

        BigInteger [] expected = {new BigInteger("-10"),new BigInteger("0"),new BigInteger("-1"),new BigInteger("0")};

        // when
        BigInteger [] actual = PolyUtils.mul(f1,f2);

        // then
        Assert.assertArrayEquals (actual, expected);
    }


}
