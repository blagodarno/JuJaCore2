package ua.com.juja.sea_port;

/**
 * Created by asu06 on 31.05.16.
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    public float calculatePayment(float rental) {
        if (rental <=0) { rental=DEFAULT_RENTAL;}
        return rental*passengers;
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL*passengers;
    }
}

