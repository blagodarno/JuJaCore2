package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class FIO {
    private String firstname;
    private String lastname;

    public FIO (String firstname, String lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public void setFirstname (String firstname){ this.firstname=firstname;}

    public void setLastname(String lastname){ this.lastname=lastname;}

    public void set (String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public String toString () {return firstname+"."+lastname;}
}
