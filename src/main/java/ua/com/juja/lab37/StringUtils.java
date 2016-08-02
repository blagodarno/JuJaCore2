package ua.com.juja.lab37;

import sun.invoke.empty.Empty;

import javax.print.DocFlavor;

/**
 * Created by asu06 on 13.06.16.
 */
public class StringUtils {
    public static String rightShift(String arg, int delta) {

        if (arg == null) throw new IllegalArgumentException("arg is null");

        if (arg.equals("")){
            return arg;
            }

        String result = arg;
        int correctDelta = 0;
        if(delta == Integer.MIN_VALUE){
            delta += result.length();
        }
        if(result.length() < Math.abs(delta)){
            correctDelta = Math.abs(delta)%result.length();
        }else{
            correctDelta = Math.abs(delta);
        }

        if (delta == 0) {
            return arg;
        } else if (delta > 0) {
            for (int i = 0; i < correctDelta; i++) {
                arg = arg.charAt(arg.length() - 1) + arg.substring(0, arg.length() - 1);
            }
        } else {
            for (int i = 0; i < Math.abs(correctDelta); i++) {
                arg = arg.substring(1, arg.length() ) + arg.charAt(0);
            }
        }

        return arg;
    }
}
