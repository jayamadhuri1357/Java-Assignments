// Custom Exception Class
// Thrown when an employee with the specified ID
// is not found in the Employee Management System.
public class EmployeeNotFoundException extends Exception {
    // Constructor that accepts a custom error message
    public EmployeeNotFoundException(String message) {
        // Calls the constructor of the parent Exception class
        super(message);
    }
}