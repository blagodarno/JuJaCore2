package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class Wrench {

    private int leftside;
    private int rightside;
    private int number;

    public Wrench (int number){
        this.number=number;
        this.leftside=number+12;
        this.rightside=number+14;
    }

    public String toString(){
        return "I am Wrench number "+ number + " with sizes: " + leftside +" X "+rightside;

    }
}
