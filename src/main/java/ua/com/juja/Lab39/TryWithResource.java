package ua.com.juja.Lab39;

/**
 * Created by asu06 on 22.07.16.
 */
public class TryWithResource {

    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        // --- create A ---
        AutoCloseable resourceA = factoryA.create();
        // --- create B ---
        AutoCloseable resourceB;

        try {

            resourceB = factoryB.create();
        }catch (Throwable createBEx){
            try {
                resourceA.close();
            }catch (Throwable closeAEx) {
                createBEx.addSuppressed(closeAEx);
            }
            throw createBEx;
        }

        // --- run body ---

        try {
            body.runBody();
        } catch (Throwable bodyEx) {
// clode B
            try {
                resourceB.close();
            } catch (Throwable closeBEx) {
                bodyEx.addSuppressed(closeBEx);
//close A
                try {
                    resourceA.close();
                } catch (Throwable closeAEx) {
                    bodyEx.addSuppressed(closeAEx);
                    throw bodyEx;
                }
                throw bodyEx;
            }
//close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                bodyEx.addSuppressed(closeAEx);
                throw bodyEx;
            }
            throw bodyEx;
        }
//close B
        try {
            resourceB.close();
        } catch (Throwable closeBEx) {
//cose A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                closeBEx.addSuppressed(closeAEx);
                throw closeBEx;
            }
            throw closeBEx;
        }
        // --- close ---
        resourceA.close();
    }
}



interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}


