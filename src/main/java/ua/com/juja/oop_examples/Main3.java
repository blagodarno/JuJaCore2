package ua.com.juja.oop_examples;

//import ua.com.juja.sto.FIO;

/**
 * Created by asu06 on 26.05.16.
 */
public class Main3 {

    static FIO[] fios = new FIO[10000];

    public static void main(String[] args) {
        for (int i = 0; i < fios.length; i++) {
            fios[i] = new FIO();
        }

        int index = 56;

        FIO fio1 = fios[index];
        fio1.setFirstName("Stiven");
        fio1.setSecondName("Pupkin");

        FIO fio2 = fios[index + 1];
        fio2.set("Ekaterina", "Pupkina");

        System.out.println(fio2.toString());
        System.out.println(fios[56].toString());

        Issue test_issue = new Issue("TestNameIssue" , 100);
        System.out.println(test_issue.toPrint());

        Book test_book = new Book("SomeBook",50,"Bob_Petroff");
        System.out.println(test_book.toPrint());

        Journal test_journal = new Journal("SomeJournal", 120 , "1988" , "12" );
        System.out.println(test_journal.toPrint());

        int countPages = 100;

        String testNameIssue = "TestNameIssue";

        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";

        String testNameJournal = "TestNameJournal";
        String testYearJournal = "TestYearJournal";
        String testNumberJournal = "TestNumberJournal";
        Library library = new Library();

        Issue[] arrayIssue = new Issue[3];

        arrayIssue[0] = new Issue(testNameIssue, countPages);
        arrayIssue[1] = new Book(testNameBook, countPages, testAuthorBook);
        arrayIssue[2] = new Journal(testNameJournal, countPages, testYearJournal, testNumberJournal);

        String actualPrintCatalog = library.printCatalog(arrayIssue);
        System.out.println(actualPrintCatalog);

    }

}
