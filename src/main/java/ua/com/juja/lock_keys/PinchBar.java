package ua.com.juja.lock_keys;

/**
 * Created by indigo on 10.08.2015.
 */
public class PinchBar implements Key {

    @Override
    public String getCode() {
        System.out.println("bang!!!");
        return "bang!!!";
    }
}
