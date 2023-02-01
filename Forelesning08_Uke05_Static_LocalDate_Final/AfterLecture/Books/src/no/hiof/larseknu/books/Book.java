package no.hiof.larseknu.books;

class Book {
    private String title;
    private String author;
    private static int bookCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static int getBookCount() {
        return bookCount;
    }
}


