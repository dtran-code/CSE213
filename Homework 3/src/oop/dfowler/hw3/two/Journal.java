package oop.dfowler.hw3.two;
/**
 * subclass of Citation
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */

public class Journal extends Citation {
    private final String journalName;
    private final int volume;
    private final int startPage;
    private final int endPage;

    public Journal(String author, String title, int year, String JournalName, int Volume, int StartPage, int EndPage) {
        super(author, title, year);
        journalName = JournalName;
        volume = Volume;
        startPage = StartPage;
        endPage = EndPage;
    }

    public String getJournalName() {
        return this.journalName;
    }
    public int getVolume() {
        return this.volume;
    }
    public int getStartPage() {
        return this.startPage;
    }
    public int getEndPage() {
        return this.endPage;
    }
    public String toString() {
        return super.toString() +"\n" + this.getJournalName() +
                ",vol. "+this.getVolume() + " (pp." + this.getStartPage() + "-" + this.getEndPage() + ")";
    }
}
