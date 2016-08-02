package ua.com.juja.lock_keys;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by indigo on 10.08.2015.
 */
public class ClassicIronBilletKey extends IronBilletKey {

    private int[] notch;

    public ClassicIronBilletKey(int... notch) {
        this.notch = notch;
    }

    @Override
    int[] getNotch() {
        return notch;
    }

    @Override
    public String toString() {
        return "I am ClassicIronBilletQwe with notch " + Arrays.toString(notch);
    }
}
