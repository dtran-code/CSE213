package oop.dfowler.hw3.two;

/**
 * subclass of Citation
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */
public class Book extends Citation {
    protected String publisher;

    Book(String author, String title, int year, String publisher) {
        super(author, title, year);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }
    public String toString() {
        return  super.toString() +"\n" + this.getPublisher();
    }
}
