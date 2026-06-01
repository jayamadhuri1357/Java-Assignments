// Employee Class
// Represents an employee in the Employee Management System.
// Demonstrates Encapsulation by keeping data members private
// and providing public getter methods.
public class Employee {
    // Employee attributes
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    // Constructor to initialize employee details
    public Employee(int employeeId, String name,
                    String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    // Getter method for Employee ID
    public int getEmployeeId() {
        return employeeId;
    }
    // Getter method for Employee Name
    public String getName() {
        return name;
    }
    // Getter method for Department
    public String getDepartment() {
        return department;
    }
    // Getter method for Salary
    public double getSalary() {
        return salary;
    }
    // Returns employee details in a readable format
    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: ₹" + salary;
    }
}