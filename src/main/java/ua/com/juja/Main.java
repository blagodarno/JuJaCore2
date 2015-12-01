package ua.com.juja;

/**
 * Created by oleksandr.baglai on 01.12.2015.
 */
public class Main {

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
