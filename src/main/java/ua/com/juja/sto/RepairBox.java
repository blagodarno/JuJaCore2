package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class RepairBox extends Building{

    private OverPass [] overPasses;

    public RepairBox(int number, int numberOverPasess){
        super(number);
        overPasses = new OverPass[numberOverPasess];
        for (int i = 0; i < numberOverPasess; i++) {
            overPasses[0] = new OverPass(i,true,i+2);
        }

    }

    public String toString(){
//        return "I am RepairBox number # " + (number)+ "\n";
        String result = super.toString()+"\n" ;
        for (OverPass overpass : overPasses) {
            result += "\t"+overpass+"\n";
        }
        return result;
    }

    public OverPass[] getOverPass (){
        return overPasses;
    }

    public OverPass getFreeOverPass() {
        for (OverPass ovrepass : overPasses){
            if (ovrepass.isFree()){
                return ovrepass;

            }
        }
    return null;
    }
}
