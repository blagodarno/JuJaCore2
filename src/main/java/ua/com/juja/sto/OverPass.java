package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class OverPass {

    private int number;
    private boolean lift;
    private Wrenchset[] wrenchsets;
    private Workermen [] workermens;
    private int capacity;

    public OverPass(int number, boolean lift, int numbersets) {
        this.number = number;
        this.lift = lift;
        this.capacity = 2;
        workermens = new Workermen[2];
        wrenchsets = new Wrenchset[numbersets];

        for (int i = 0; i < numbersets; i++) {
            wrenchsets[i] = new Wrenchset(i, i*2);
        }

    }

    public String toString(){
     //   return "I am OverPass number # " + number + " with Lift: "+ lift;


        String result = "I am OverPass number # " + number + " with Lift: "+ lift+" and "+wrenchsets.length+" wrenchsets" +"\n" ;
        for (Wrenchset wrenchset : wrenchsets) {
            result += "\t"+wrenchset+"\n";
        }
        return result;
    }

    public boolean isFree() {
        return nextIndex()!=-1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addWorkerMen(Workermen workermen) {
        int i = nextIndex();
        if (i==-1){
            throw new RuntimeException("This OverPass not have vacancy!");
        }
        workermens[i] = workermen;
    }

    private int nextIndex() {
        for (int i = 0; i <workermens.length ; i++) {
            if (workermens[i]==null){
                return i;
            }
        }
    return -1;
    }
}
