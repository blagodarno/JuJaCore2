package ua.com.juja.sea_port;

/**
 * Created by asu06 on 31.05.16.
 */
public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    public float calculatePayment(float rental) {
        if (rental <=0) { rental=DEFAULT_RENTAL;}
        return rental*tonnage;
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL*tonnage;
    }

}
