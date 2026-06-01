import java.util.InputMismatchException;
import java.util.Scanner;
// Main Class
// Entry point of the Employee Management System.
// Provides a menu-driven console application for managing employees.
// Demonstrates Exception Handling, OOP, Collections, Optional, and Stream API usage.
public class Main {
    public static void main(String[] args) {
        // Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        // EmployeeManager object to perform employee operations
        EmployeeManager manager = new EmployeeManager();
        // Infinite loop to keep the application running
        while (true) {
            try {
                // Display menu options
                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Display All Employees");
                System.out.println("3. Search Employee By ID");
                System.out.println("4. Filter Employees By Department");
                System.out.println("5. Display Employees Above Salary");
                System.out.println("6. Remove Employee");
                System.out.println("7. Display Employee Count");
                System.out.println("8. Search Employee By Name");
                System.out.println("9. Display Average Salary");
                System.out.println("10. Exit");
                // Read user choice
                System.out.print("Enter Choice: ");
                int choice = scanner.nextInt();
                // Execute operation based on user choice
                switch (choice) {
                    // Add Employee
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        manager.addEmployee(new Employee(id, name, department, salary));
                        System.out.println("Employee added successfully.");
                        break;
                    // Display all employees
                    case 2:
                        manager.displayAllEmployees();
                        break;
                    // Search employee by ID
                    case 3:
                        System.out.print("Enter Employee ID: ");
                        int searchId = scanner.nextInt();
                        System.out.println(manager.findEmployeeById(searchId));
                        break;
                    // Display employees by department
                    case 4:
                        scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        manager.displayEmployeesByDepartment(dept);
                        break;
                    // Display employees above a specified salary
                    case 5:
                        System.out.print("Enter Minimum Salary: ");
                        double minSalary = scanner.nextDouble();
                        manager.displayHighSalaryEmployees(minSalary);
                        break;
                    // Remove employee by ID
                    case 6:
                        System.out.print("Enter Employee ID to Remove: ");
                        int removeId = scanner.nextInt();
                        manager.removeEmployee(removeId);
                        break;
                    // Display total employee count
                    case 7:
                        manager.displayEmployeeCount();
                        break;
                    // Search employee by name
                    case 8:
                        scanner.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String employeeName = scanner.nextLine();
                        manager.searchEmployeeByName(employeeName);
                        break;
                    // Display average salary of employees
                    case 9:
                        manager.displayAverageSalary();
                        break;
                    // Exit application
                    case 10:
                        System.out.println("Exiting Application...");
                        scanner.close();
                        System.exit(0);
                        break;
                    // Invalid menu option
                    default:
                        System.out.println("Invalid Choice.");
                }
            }
            // Handles invalid input such as entering text instead of numbers
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the correct data type.");
                scanner.nextLine();
            }
            // Handles employee not found scenarios
            catch (EmployeeNotFoundException e) {
                System.out.println(e.getMessage());
            }
            // Handles duplicate employee ID scenarios
            catch (DuplicateEmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}