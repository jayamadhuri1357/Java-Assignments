import java.util.*;
import java.util.stream.Collectors;
// EmployeeManager Class
// Responsible for managing employee records using
// ArrayList and HashMap collections.
// Demonstrates Collections Framework, Optional API,
// Stream API, and Custom Exception Handling.
public class EmployeeManager {
    // Stores all employee objects
    private List<Employee> employees = new ArrayList<>();
    // Stores employee records with Employee ID as key
    // for fast searching
    private Map<Integer, Employee> employeeMap = new HashMap<>();
    // Adds a new employee to the system
    // Throws DuplicateEmployeeException if Employee ID already exists
    public void addEmployee(Employee employee) throws DuplicateEmployeeException {
        if (employeeMap.containsKey(employee.getEmployeeId())) {
            throw new DuplicateEmployeeException("Employee ID " + employee.getEmployeeId() + " already exists.");
        }
        employees.add(employee);
        employeeMap.put(employee.getEmployeeId(), employee);
    }
    // Finds an employee by ID using Optional API
    // Throws EmployeeNotFoundException if employee is not found
    public Employee findEmployeeById(int id)throws EmployeeNotFoundException {
        return Optional.ofNullable(employeeMap.get(id)).orElseThrow(() 
        ->new EmployeeNotFoundException("Employee with ID " + id + " not found"));
    }
    // Returns employee as an Optional object
    public Optional<Employee> getEmployeeOptional(int id) {
        return Optional.ofNullable(employeeMap.get(id));
    }
    // Displays all employees available in the system
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        employees.forEach(System.out::println);
    }
    // Displays employees belonging to a specific department
    // Uses Stream API and filter operation
    public void displayEmployeesByDepartment(String department) {
        List<Employee> filteredEmployees =
        employees.stream().filter(emp ->emp.getDepartment().equalsIgnoreCase(department)).collect(Collectors.toList());
        if (filteredEmployees.isEmpty()) {
            System.out.println("No employees found in this department.");
        } else {
            filteredEmployees.forEach(System.out::println);
        }
    }
    // Displays employees whose salary is greater than
    // the given salary value
    // Uses Stream API
    public void displayHighSalaryEmployees(double salary) {
        List<Employee> highSalaryEmployees =
                employees.stream().filter(emp -> emp.getSalary() > salary).collect(Collectors.toList());
        if (highSalaryEmployees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            highSalaryEmployees.forEach(System.out::println);
        }
    }
    // Removes an employee using Employee ID
    // Throws EmployeeNotFoundException if ID does not exist
    public void removeEmployee(int id)throws EmployeeNotFoundException {
        Employee employee = findEmployeeById(id);
        employees.remove(employee);
        employeeMap.remove(id);
        System.out.println("Employee removed successfully.");
    }
    // Feature 1:
    // Displays total number of employees in the system
    public void displayEmployeeCount() {
        System.out.println("Total Employees: " + employees.size());
    }
    // Feature 2:
    // Searches employees by name using Stream API
    public void searchEmployeeByName(String name) {
        List<Employee> matchingEmployees =
        employees.stream().filter(emp -> emp.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        if (matchingEmployees.isEmpty()) {
            System.out.println("No employee found with name: " + name);
        } else {
            matchingEmployees.forEach(System.out::println);
        }
    }
    // Feature 3:
    // Calculates and displays average salary of all employees
    // Uses Stream API mapToDouble() and average()
    public void displayAverageSalary() {
        double average =employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println("Average Salary: ₹" + average);
    }
}