package no.hiof.larseknu.books;

public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", "Leo Tolstoy");
        EBook greatGatsby = new EBook("The Great Gatsby", "F. Scott Fitzgerald", "PDF", 2);

        System.out.println("Total number of books: " + Book.getBookCount());

        Book nameOfTheWind = new Book("The Name Of The Wind", "Patrick Rothfuss");
        Book wiseMansFear = new Book("A Wise Man's Fear", "Patrick Rothfuss");
        EBook killAMockingbird = new EBook("To Kill a Mockingbird", "Harper Lee", "ePub", 1);

        System.out.println("Total number of books: " + Book.getBookCount());

    }
}
