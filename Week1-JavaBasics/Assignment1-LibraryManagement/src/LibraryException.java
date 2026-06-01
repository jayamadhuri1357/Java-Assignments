// Custom Exception Class
// Used to handle library-related errors such as:
// - Invalid Book ID
// - Duplicate Book ID
// - Invalid User ID
// - Duplicate User ID
// - Book Not Found
// - Book Already Borrowed
// - Book Was Not Borrowed
public class LibraryException extends Exception {
    // Constructor that accepts a custom error message
    public LibraryException(String message) {
        // Calls the constructor of the parent Exception class
        super(message);
    }
}