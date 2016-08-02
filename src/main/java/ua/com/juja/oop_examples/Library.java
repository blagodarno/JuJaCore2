package ua.com.juja.oop_examples;

/**
 * Created by asu06 on 31.05.16.
 */
public class Library {

    public String printCatalog(Issue[] catalog) {
        String res = "";
        if (catalog.length==0) return res;
        for (int i = 0; i < catalog.length; i++) {
            Issue current_issue = catalog[i];
            res=res+current_issue.toPrint();
        }
    return res;
    }

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        String res = "";
        if (catalog.length==0) return res;
        for (int i = 0; i < catalog.length; i++) {
            Issue current_issue = catalog[i];
            if (current_issue.getCountPages()>barrierCountPages){
                res=res+current_issue.toPrint();
            }
        }
        return res;
    }

}
