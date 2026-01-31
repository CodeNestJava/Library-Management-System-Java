// Book class
// Represents a single book in the library

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Issue the book
    public void issueBook() {
        this.isIssued = true;
    }

    // Return the book
    public void returnBook() {
        this.isIssued = false;
    }
}
