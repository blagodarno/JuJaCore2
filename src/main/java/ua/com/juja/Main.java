package ua.com.juja;

/**
 * Created by oleksandr.baglai on 01.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        assertMethod("codex", "codey");
        assertMethod("x", "y");
        assertMethod("xxhixx", "yyhiyy");
        assertMethod("xhixhix", "yhiyhiy");
        assertMethod("hiy", "hiy");
        assertMethod("h", "h");
        assertMethod("", "");
        assertMethod("xxx", "yyy");
        assertMethod("yyhxyi", "yyhyyi");
        assertMethod("hihi", "hihi");
    }

    private static void assertMethod(String input, String expected) {
        String actual = changeXY(input);
        String status = actual.equals(expected) ?
                "OK" :
                "FAIL expected: '" + expected + "' but was: '" + actual + "'";
        System.out.println(status);
    }

    public static String changeXY(String input) {
        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x') {
                result[index] = 'y';
            } else {
                result[index] = chars[index];
            }
        }
        return String.valueOf(result);
    }

    // make it work -> make it better -> make it fast

}
