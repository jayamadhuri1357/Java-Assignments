// Main Class
// Entry point of the Library Management System.
// Demonstrates OOP, Collections Framework,
// Custom Exception Handling, Stream API,
// and Lambda Expressions.
public class Main {
    public static void main(String[] args) {
        // Create Library object
        Library library = new Library();
        // -----------------------------
        // Add Valid Books
        // -----------------------------
        try {
            library.addBook(new Book(1, "Java Basics", "James Gosling"));
            library.addBook(new Book(2, "OOP Concepts", "Bjarne Stroustrup"));
            library.addBook(new Book(3, "Data Structures", "Mark Allen"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Invalid Book Operations
        // -----------------------------
        try {
            // Attempt to add a book with an existing Book ID
            library.addBook(new Book(1, "Duplicate Book", "Unknown"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }        try {
            // Attempt to add a book with an invalid Book ID
            library.addBook(new Book(-5, "Invalid ID Book", "Author"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }        try {
            // Attempt to add a book with an empty title
            library.addBook(new Book(4, "", "Author"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Add Valid Users
        // -----------------------------
        try {
            library.addUser(new User(101, "Jaya"));
            library.addUser(new User(102, "Madhuri"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Invalid User Operations
        // -----------------------------
        try {
            // Attempt to add a user with an existing User ID
            library.addUser(new User(101, "Duplicate User"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Attempt to add a user with an invalid User ID
            library.addUser(new User(-10, "Invalid User"));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Attempt to add a user with an empty name
            library.addUser(new User(103, ""));
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Display Available Books
        // -----------------------------
        library.displayBooks();
        // -----------------------------
        // Borrow a Book
        // -----------------------------
        try {            
          library.borrowBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Invalid Borrow Operations
        // -----------------------------
        try {
            // Attempt to borrow the same book again
            library.borrowBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Attempt to borrow a book that does not exist
            library.borrowBook(99);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Return a Borrowed Book
        // -----------------------------
        try {
            library.returnBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Invalid Return Operations
        // -----------------------------
        try {
            // Attempt to return the same book again
            library.returnBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Attempt to return a book that does not exist
            library.returnBook(100);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // -----------------------------
        // Display Final Book Status
        // -----------------------------
        library.displayBooks();
    }
}