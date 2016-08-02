package ua.com.juja.sto;

/**
 * Created by asu06 on 26.05.16.
 */
public abstract class Building {
    protected int number;

    public Building (int number){
        this.number = number;
    }

    public String toString(){
        String typeBuilding = this.getClass().getSimpleName();
        return "I am " + typeBuilding + " number # " + number;
    }

}
