package oop.dfowler.hw3.two;
/**
 * implement the class Author.java, with a main() method that creates an array of at
 * least five author.
 *
 * @author Donovan Fowler
 * @version hw 3, #2
 * @bugs None
 */
public class Author {

    private final String lastName;

    private final String firstName;

    private final String middleInitial;



    public Author(String firstName, String middleInitial, String lastName) {

        this.lastName = lastName;

        this.firstName = firstName;

        this.middleInitial = middleInitial.charAt(0) + ".";

    }



    public Author(String fullName) {

        String[] tokens = fullName.split("\\s+");

        if (tokens.length == 2) {

            this.firstName = tokens[0];

            this.lastName = tokens[1];

            this.middleInitial = "";

        } else {

            this.firstName = tokens[0];

            this.lastName = tokens[2];

            this.middleInitial = tokens[1].toUpperCase().charAt(0) + ".";

        }

    }



    public String getLastName() {

        return lastName;

    }



    public String getFirstName() {

        return firstName;

    }



    public String getMiddleInitial() {

        return middleInitial;

    }



    public String getCitation() {
        return getLastName() + ", " + getFirstName().charAt(0) + ". " + getMiddleInitial();

    }



    public static Author[] splitAuthors(String list) {

        list = list.replaceAll("and","");

        String[] names = list.split(",");

        Author[] authors = new Author[names.length];

        for (int index = 0; index < names.length; index++) {

            authors[index] = new Author(names[index].trim());

        }

        return authors;

    }

    public static void main(String[] args) {
        Author a = new Author("Henry", "D", "Thoreau");
        System.out.println(a.getFirstName());
        System.out.println(a.getMiddleInitial());
        System.out.println(a.getLastName());
        System.out.println("Using getCitation method = " + a.getCitation());


        Author aa = new Author("Henry D Thoreau");
        System.out.println(aa.getFirstName());
        System.out.println(aa.getMiddleInitial());
        System.out.println(aa.getLastName());
        System.out.println("Using getCitation method = " + aa.getCitation());


        Author[] splitAuthors = Author.splitAuthors("Mark Twain, Henry D. Thoreau, R W Emerson, and N Hawthorne");

        for (Author author : splitAuthors) {
            System.out.println(author.getFirstName()+" "+author.getMiddleInitial()+" "+author.getLastName());
            System.out.println(author.getCitation());
        }
    }
}
