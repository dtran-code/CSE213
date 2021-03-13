package oop.dfowler.hw3.two;

/**
 * subclass of Citation
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */

public class Website extends Citation {
    private final String url;
    private final String month;
    private final int day;
    public Website(String author, String title, int year, String URL, String Month, int Day) {
        super(author, title, year);
        url = URL;
        month = Month;
        day = Day;
    }
    public String getUrl() {
        return this.url;
    }
    public String getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    public String toString() {
        return super.toString() +"\n" + this.getUrl() + ", "
                + getMonth() +" "+ getDay();
    }
}
