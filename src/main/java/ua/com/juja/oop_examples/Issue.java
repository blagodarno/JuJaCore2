package ua.com.juja.oop_examples;

/**
 * Created by asu06 on 30.05.16.
 */
public class Issue {
    protected  String name;
    protected  int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }



//    public String toPrint() {
//        return "name=" + name +
//                ",countPages=" + countPages;
//    }

    public  String toPrint() {
        return "Issue{" +
                "name=" + name +
                ",countPages=" + countPages +
                "}";
    }

    public  int getCountPages() {
        return countPages;
    }

    public String getName(){
        return name;
    }

}


