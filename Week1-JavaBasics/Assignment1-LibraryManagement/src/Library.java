import java.util.ArrayList;
import java.util.HashMap;
// Library Class
// Manages books and users in the Library Management System.
// Demonstrates Collections Framework (ArrayList and HashMap),
// Exception Handling, Stream API, and Lambda Expressions.
public class Library {
    // Stores all books available in the library
    private ArrayList<Book> books;
    // Stores users with User ID as the key
    private HashMap<Integer, User> users;
    // Constructor
    // Initializes book and user collections
    public Library() {
        books = new ArrayList<>();
        users = new HashMap<>();
    }
    // Adds a new book to the library
    // Performs validation checks before adding
    public void addBook(Book book) throws LibraryException {
        // Check if Book ID is valid
        if (book.getBookId() <= 0) {

            throw new LibraryException("Invalid Book ID.");
        }
        // Check if Book Title is empty
        if (book.getTitle().trim().isEmpty()) {
            throw new LibraryException("Book title cannot be empty.");
        }
        // Check if Author Name is empty
        if (book.getAuthor().trim().isEmpty()) {
            throw new LibraryException("Author name cannot be empty.");
        }
        // Check for duplicate Book ID
        for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                throw new LibraryException("Book ID already exists.");
            }
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }
    // Adds a new user to the library
    // Performs validation checks before adding
    public void addUser(User user) throws LibraryException {
        // Check if User ID is valid
        if (user.getUserId() <= 0) {
            throw new LibraryException("Invalid User ID.");
        }
        // Check if User Name is empty
        if (user.getName().trim().isEmpty()) {
            throw new LibraryException("User name cannot be empty.");
        }
        // Check for duplicate User ID
        if (users.containsKey(user.getUserId())) {

            throw new LibraryException("User ID already exists.");
        }
        users.put(user.getUserId(), user);
        System.out.println("User added successfully.");
    }
    // Displays all books available in the library
    // Uses Stream API and Lambda Expression
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("\nNo books available in library.");
            return;
        }
        System.out.println("\nBooks Available in Library:");
        books.stream().forEach(book -> System.out.println(book));
    }
    // Borrows a book using Book ID
    public void borrowBook(int bookId) throws LibraryException {
        // Search for the book using Stream API
        Book foundBook = books.stream().filter(book -> book.getBookId() == bookId).findFirst().orElse(null);
        // Check if book exists
        if (foundBook == null) {
            throw new LibraryException("Book not found.");
        }
        // Check if book is already borrowed
        if (!foundBook.isAvailable()) {
            throw new LibraryException("Book already borrowed.");
        }
        // Mark book as unavailable
        foundBook.setAvailable(false);
        System.out.println("Book borrowed successfully.");
    }
    // Returns a borrowed book using Book ID
    public void returnBook(int bookId) throws LibraryException {
        // Search for the book using Stream API
        Book foundBook = books.stream().filter(book -> book.getBookId() == bookId).findFirst().orElse(null);
        // Check if book exists
        if (foundBook == null) {
            throw new LibraryException("Book not found.");
        }
        // Check if book was actually borrowed
        if (foundBook.isAvailable()) {
            throw new LibraryException("Book was not borrowed.");
        }
        // Mark book as available again
        foundBook.setAvailable(true);
        System.out.println("Book returned successfully.");
    }
}