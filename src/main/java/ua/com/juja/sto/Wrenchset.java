package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
    public class Wrenchset {

    private int number;
    private Wrench [] wrenches;

    public Wrenchset ( int number, int quantity){
        this.number = number;
        wrenches = new Wrench[quantity];
        for (int i = 1; i < quantity; i++) {
            Wrench wrench1 = new Wrench(i);
            wrenches [i] = wrench1;
        }
    }

    public String toString(){
        //return "I am Wrenchset number # " + number + " with wrenches " + wrenches[0] ;

        String result = "I am Wrenchset number # " + number +"\n" ;
        for (Wrench wrench : wrenches) {
            result += "\t"+wrench+"\n";
        }
        return result;

    }
}

