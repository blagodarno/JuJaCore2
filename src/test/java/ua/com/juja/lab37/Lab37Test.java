package ua.com.juja.lab37;

import org.junit.Assert;
import org.junit.Test;
import ua.com.juja.lab37.StringUtils;

import java.math.BigInteger;

/**
 * Created by asu06 on 13.06.16.
 */
public class Lab37Test {

    @Test
    public void test1() {
        // given

        String src = "ABCDE";
        String expected = "EABCD";

        // when
       String actual = StringUtils.rightShift(src,1);

        // then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test2() {
        // given

        String src = "ABCDE";
        String expected = "DEABC";

        // when
        String actual = StringUtils.rightShift(src,2);

        // then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test5() {
        // given

        String src = "ABCDE";
        String expected = "ABCDE";

        // when
        String actual = StringUtils.rightShift(src,5);

        // then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test7() {
        // given

        String src = "ABCDE";
        String expected = "DEABC";

        // when
        String actual = StringUtils.rightShift(src,7);

        // then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void testMin1() {
        // given

        String src = "ABCDE";
        String expected = "BCDEA";
        // when
        String actual = StringUtils.rightShift(src,-1);

        // then
        Assert.assertEquals (expected, actual);
    }
    @Test
    public void testMin7() {
        // given

        String src = "ABCDE";
        String expected = "CDEAB";

        // when
        String actual = StringUtils.rightShift(src,-7);

        // then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void testBlank() {
        // given

        String src = "";
        String expected = "";

        // when
        String actual = StringUtils.rightShift(src,-100000);

        // then
        Assert.assertEquals (expected, actual);
    }

}
