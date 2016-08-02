package ua.com.juja.sea_port;

/**
 * Created by asu06 on 31.05.16.
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    public float calculatePayment(float rental) {
        if (rental <=0) { rental=DEFAULT_RENTAL;}
        return rental*volume;
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL*volume;
    }

}
