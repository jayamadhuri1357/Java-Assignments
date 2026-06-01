// User Class
// Represents a user in the Library Management System.
// Demonstrates Encapsulation by keeping data members private
// and providing public getter methods.
public class User {
    // User attributes
    private int userId;
    private String name;
    // Constructor to initialize user details
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    // Getter method for User ID
    public int getUserId() {
        return userId;
    }
    // Getter method for User Name
    public String getName() {
        return name;
    }
    // Returns user details in a readable format
    @Override
    public String toString() {
        return "User ID: " + userId +
                ", Name: " + name;
    }
}