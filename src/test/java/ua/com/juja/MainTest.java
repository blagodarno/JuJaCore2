package ua.com.juja;

import org.junit.Test;
import ua.com.juja.example_testing.Main;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 01.12.2015.  ййй
 */
public class MainTest {

    @Test
    public void test_codex_codey() {
        assertMethod("codex", "codey");
    }

    @Test
    public void test_x_y() {
        assertMethod("x", "y");
    }

    @Test
    public void test_xxhixx_yyhiyy() {
        assertMethod("xxxhixxx", "yyyhiyyy");
        assertMethod("xxhixx", "yyhiyy");
        assertMethod("xhix", "yhiy");
    }

    @Test
    public void test_hiy_hiy() {
        assertMethod("hiy", "hiy");
        assertMethod("yih", "yih");
    }

    @Test
    public void test_h_h() {
        assertMethod("h", "h");
        assertMethod("a", "a");
    }

    @Test
    public void test__() {
        assertMethod("", "");
    }

    @Test
    public void test_xxx_yyy() {
        assertMethod("x", "y");
        assertMethod("xxx", "yyy");
        assertMethod("xxxx", "yyyy");
    }

    @Test
    public void test_yyhxyi_yyhyyi() {
        assertMethod("yyhxyi", "yyhyyi");
    }

    @Test
    public void test_hihi_hihi() {
        assertMethod("hihi", "hihi");
        assertMethod("haha", "haha");
    }

    private static void assertMethod(String input, String expected) {
        String actual = Main.changeXY(input);
        assertEquals(expected, actual);
    }
}
