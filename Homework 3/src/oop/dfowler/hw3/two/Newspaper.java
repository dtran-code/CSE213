package oop.dfowler.hw3.two;
/**
 * subclass of Citation
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */


public class Newspaper extends Citation {
    private final String newspaper;
    private final String month;
    private final int day;

    public Newspaper(String author, String title, int year, String Newspaper, String Month, int Day) {
        super(author, title, year);
        newspaper = Newspaper;
        month = Month;
        day = Day;
    }

    public String getNewspaper() {
        return this.newspaper;
    }
    public String getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    public String toString() {
        return super.toString() +"\n" + this.getNewspaper() + ", "
                + getMonth() +" "+ getDay();
    }
}
