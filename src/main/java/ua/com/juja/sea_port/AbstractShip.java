package ua.com.juja.sea_port;

/**
 * Created by asu06 on 31.05.16.
 */
abstract class AbstractShip {

    private String name;
    protected float length;
    protected float width;
    protected float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}
