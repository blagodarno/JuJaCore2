package ua.com.juja.sea_port;


import ua.com.juja.oop_examples.Issue;

/**
 * Created by asu06 on 31.05.16.
 */
public class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        for (int i = 0; i <arrayShip.length; i++) {
            if (arrayShip[i]==null){
                arrayShip[i]=ship;
                return indexShipInPort++;

            }
        }
        return -1;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (arrayShip[0] == null && arrayShip[1] == null && arrayShip[2] == null) {
            return -1;
        }
        System.arraycopy(arrayShip, 1, arrayShip, 0, arrayShip.length - 1);
        return 1;
    }

    @Override
    public String printQueueShip() {
        String res = "";
        if (arrayShip[0] == null && arrayShip[1] == null && arrayShip[2] == null) {
            return "QueueEmpty";
        }
        for (int i = 0; i < arrayShip.length-1; i++) {
                res=res+ "{Name="+arrayShip[i].getName()+"Length="+arrayShip[i].length+"Width="+
                        arrayShip[i].width+"Displacement="+arrayShip[i].displacement+"};";
        }
        return res;
    }

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {

    if(arrayShips==null || arrayShips.length==0){return "";}
        int k=0;
        String res = "";
        for (int m = arrayShips.length; m >=0 ; m--) {
            for (int i = 0; i < arrayShips.length-1; i++) {
            k = i + 1;
            if (arrayShips[i].calculatePayment() > arrayShips[k].calculatePayment()) {
                AbstractShip temp;
                temp = arrayShips[i];
                arrayShips[i] = arrayShips[k];
                arrayShips[k] = temp;
                }
            }
        }
        for (int i = 0; i < arrayShips.length; i++) {
            res=res+arrayShips[i].getName()+"="+arrayShips[i].calculatePayment();

        }
        return res;

    }
}
