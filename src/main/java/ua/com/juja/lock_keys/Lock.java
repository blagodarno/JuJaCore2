package ua.com.juja.lock_keys;

/**
 * Created by indigo on 10.08.2015.
 */
public interface Lock {

    void unlock(Key key);

    boolean isOpened();
}
