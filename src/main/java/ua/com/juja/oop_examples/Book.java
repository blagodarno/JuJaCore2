package ua.com.juja.oop_examples;

/**
 * Created by asu06 on 30.05.16.
 */
public class Book extends Issue{

    private  String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook=authorBook;
    }

//    public String toPrint() {
//        return "Book{"+super.toPrint()+
//                ",author=" + authorBook+"}";
//    }

    //    @Override
    public  String toPrint() {
        return "Book{" +
                "name=" + getName() +
                ",countPages=" + getCountPages() +
                ",author=" + authorBook +
                "}";
    }

}
