package ua.com.juja.oop_examples;

/**
 * Created by asu06 on 31.05.16.
 */
public class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String nameJournal, int countPages, String yearJournal, String numberJournal){
        super(nameJournal,countPages);
        this.yearJournal=yearJournal;
        this.numberJournal=numberJournal;

    }

//    public String toPrint() {
//        return "Journal{"+super.toPrint()+
//                ",year=" + yearJournal+",number="+numberJournal+"}";
//    }
//    @Override
    public  String toPrint() {
    return "Journal{" +
            "name=" + getName() +
            ",countPages=" + getCountPages() +
            ",year=" + yearJournal +
            ",number=" + numberJournal +
            "}";
}

}
