package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class Main {
    public static void main(String[] args) {
        Sto sto = new Sto(2,5);
        RepairBox rbox4 = sto.getRbox(4);
        //System.out.println(rbox4);

        Workermen workermen1 = new Workermen(new FIO("Tom", "Huge"));
        Workermen workermen2 = new Workermen(new FIO("Bill", "Skupovsky"));
        Workermen workermen3 = new Workermen(new FIO("John", "Coperfild"));
        Workermen workermen4 = new Workermen(new FIO("Bob", "Coperfild"));
        Workermen workermen5 = new Workermen(new FIO("Diana", "Clouds"));

        Workermen [] workermen = new Workermen[6];

        workermen[1] = workermen1;
        workermen[2] = workermen2;
        workermen[3] = workermen3;
        workermen[4] = workermen4;
        workermen[5] = workermen5;

//        sto.chargingStaff(workermen);

        //System.out.println(sto);
        //System.out.println(new Wrench(2));
        //System.out.println(new Wrenchset(1,4));
        //System.out.println(new OverPass(1,true,3));
        //System.out.println(new RepairBox (1,3));
        System.out.println(sto);

    }

}
