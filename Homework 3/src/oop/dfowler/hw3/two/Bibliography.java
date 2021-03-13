package oop.dfowler.hw3.two;
/**
 * implement the class Bibliography.java, with a main() method that creates an array of at
 * least five citations. Assign each element of the array to a different instance of Citation.
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */

public class Bibliography {
    public static void main(String[] args) {
        Citation[] authors = new Citation[5];
        authors[0] = new Book("Henry David Thoreau","Walden", 1854,"Ticknor and Fields Publishing Co.");
        authors[1] = new Chapter("J. R. Tolkein","The fellowship of the Ring",1954,"","A shortcut to Mushroom",4,58,65);
        authors[2] = new Journal("Alan Mathison Turing","Computing machinery and intelligence", 1950,"Mind",59,433,460);
        authors[3] = new Newspaper("Janette E. Herbers", "NIXON RESIGNS", 1974, "New York Times","August", 8);
        authors[4] = new Website("Stephen Diehl", "Functional Programming, Abstraction, and Naming Things",2016,"http://www.stephendiehl.com/posts/abstraction.html", "January", 9);
        for (Citation a : authors) {
            System.out.println(a.toString());
            System.out.println("\n");
        }
    }

}
