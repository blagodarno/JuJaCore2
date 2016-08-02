package ua.com.juja.sea_port;

/**
 * Created by asu06 on 31.05.16.
 */
public interface SeaPortQueue {
    public final static int LENGTH_QUEUE_SHIP = 3;
    public int addShipToEndQueue(AbstractShip ship);
    public int removeShipFromBeginQueue();
    public String printQueueShip();

}
