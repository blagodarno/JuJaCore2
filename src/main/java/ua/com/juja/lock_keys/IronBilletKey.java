package ua.com.juja.lock_keys;

import java.util.Arrays;

/**
 * Created by indigo on 10.08.2015.
 */
public abstract class IronBilletKey implements Key {

    @Override
    public String getCode() {
        return Arrays.toString(getNotch());
    }

    abstract int[] getNotch();
}
