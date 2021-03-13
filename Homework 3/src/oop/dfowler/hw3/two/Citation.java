package oop.dfowler.hw3.two;

/**
 * Citation Class to represent a reference to some work by one or more Author’s.
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */
public class Citation extends Author{
    protected Author[] author;
    protected String title;
    protected int year;

    public Author[] getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Citation(String author, String title, int year) {
        super(author);
        this.author = Author.splitAuthors(author);
        this.title = title;
        this.year = year;
    }

    public String toString() {
        String n = "";
        for (Author a : getAuthor()) {
            n = n + a.getCitation();
        }
        return n + ", "+ this.getTitle() + "., " + this.getYear();
    }
}
