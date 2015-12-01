package ua.com.juja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 01.12.2015.
 */
public class MainTest {

    @Test
    public void test1() {
        assertMethod("codex", "codey");
    }

    @Test
    public void test2() {
        assertMethod("x", "y");
    }

    @Test
    public void test3() {
        assertMethod("xxhixx", "yyhiyy");
    }

    @Test
    public void test5() {
        assertMethod("hiy", "hiy");
    }

    @Test
    public void test6() {
        assertMethod("h", "h");
    }

    @Test
    public void test7() {
        assertMethod("", "");
    }

    @Test
    public void test8() {
        assertMethod("xxx", "yyy");
    }

    @Test
    public void test9() {
        assertMethod("yyhxyi", "yyhyyi");
    }

    @Test
    public void test10() {
        assertMethod("hihi", "hihi");
    }

    private static void assertMethod(String input, String expected) {
        String actual = Main.changeXY(input);
        assertEquals(expected, actual);
    }
}
