// Custom Exception Class
// Thrown when a user tries to add an employee
// with an ID that already exists in the system.
public class DuplicateEmployeeException extends Exception {
    // Constructor that accepts a custom error message
    public DuplicateEmployeeException(String message) {
        // Calls the constructor of the parent Exception class
        super(message);
    }
}