// Book Class
// Represents a book in the Library Management System.
// Demonstrates Encapsulation by keeping data members private
// and providing public getter and setter methods.
public class Book {
    // Book attributes
    private int bookId;
    private String title;
    private String author;
    private boolean available;
    // Constructor to initialize book details
    // By default, a newly added book is available
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }
    // Getter method for Book ID
    public int getBookId() {
        return bookId;
    }
    // Getter method for Book Title
    public String getTitle() {
        return title;
    }
    // Getter method for Author Name
    public String getAuthor() {
        return author;
    }
    // Getter method to check book availability status
    public boolean isAvailable() {
        return available;
    }
    // Setter method to update book availability
    public void setAvailable(boolean available) {
        this.available = available;
    }
    // Returns book details in a readable format
    @Override
    public String toString() {
        return "Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + available;
    }
}