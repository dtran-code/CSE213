package oop.dfowler.hw3.two;

/**
 * subclass of Books
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */

public class Chapter extends Book {
    private final String chapterName;
    private final int chapterNumber;
    private final int startPage;
    private final int endPage;

    public Chapter(String author, String title, int year,String publisher,String ChapterName, int ChapterNumber, int StartPage, int EndPage) {
        super(author,title,year,publisher);
        chapterName = ChapterName;
        chapterNumber = ChapterNumber;
        startPage = StartPage;
        endPage = EndPage;
    }

    public String getChapterName() {
        return this.chapterName;
    }
    public int getChapterNumber() {
        return this.chapterNumber;
    }
    public int getStartPage() {
        return this.startPage;
    }
    public int getEndPage() {
        return this.endPage;
    }
    public String toString() {
        return super.toString() +"Chapter " + this.getChapterNumber() + ", "+ this.getChapterName()+ " (pp." + this.getStartPage() + "-" + this.getEndPage() + ")";
    }
}
