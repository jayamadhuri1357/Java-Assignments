# Employee Management Console Application
## Overview
This project is a menu-driven Employee Management Console Application developed using Java. The application allows users to manage employee records efficiently using Object-Oriented Programming (OOP) principles, Java Collections Framework, Custom Exceptions, Optional API, and Stream API.
The project was developed as part of the Week 2 Java Assignment.
## Objectives
* Build an Employee Management Console Application.
* Apply Object-Oriented Programming concepts.
* Use Collections Framework for employee record management.
* Implement Custom Exceptions.
* Utilize Java 8 Optional and Stream APIs.
* Follow clean coding standards and proper documentation practices.
## Features
### Employee Operations
* Add Employee
* Display All Employees
* Search Employee by ID
* Filter Employees by Department
* Display Employees Above a Given Salary
* Remove Employee
### Additional Features
* Display Total Employee Count
* Search Employee by Name
* Display Average Salary of Employees
### Exception Handling
* EmployeeNotFoundException
* DuplicateEmployeeException
* InputMismatchException
## Technologies Used
* Java
* OOP Principles
* Collections Framework
  * ArrayList
  * HashMap
* Java 8 Optional API
* Java 8 Stream API
* Exception Handling
## Project Structure

```text
Assignment2-EmployeeManagement
│
├── src
│   ├── Employee.java
│   ├── EmployeeManager.java
│   ├── EmployeeNotFoundException.java
│   ├── DuplicateEmployeeException.java
│   └── Main.java
│
└── README.md
```
## Class Description
### Employee.java
Represents an employee entity.
Attributes:
* employeeId
* name
* department
* salary
Concept Used:
* Encapsulation
### EmployeeManager.java
Handles all employee-related operations.
Responsibilities:
* Add Employee
* Search Employee
* Remove Employee
* Display Employee Records
* Filter by Department
* Calculate Average Salary
* Count Employees
Concepts Used:
* ArrayList
* HashMap
* Optional API
* Stream API
### EmployeeNotFoundException.java
Custom exception thrown when an employee with a specified ID is not found.
### DuplicateEmployeeException.java
Custom exception thrown when attempting to add an employee with an existing Employee ID.
### Main.java
Entry point of the application.
## Responsibilities:
* Display menu options
* Accept user input
* Call EmployeeManager methods
* Handle exceptions
## OOP Concepts Implemented
### Encapsulation
Employee attributes are declared private and accessed through getter methods.
### Abstraction
Business logic is separated into EmployeeManager.
### Exception Handling
Custom and built-in exceptions are used for robust error handling.
## Collections Framework Usage
### ArrayList
Stores employee records dynamically.
```java
List<Employee> employees = new ArrayList<>();
```
### HashMap
Stores employees using Employee ID as the key for fast lookup.
```java
Map<Integer, Employee> employeeMap = new HashMap<>();
```
## Optional API Usage
Used to safely handle employee lookup operations and avoid NullPointerException.
Example:
```java
Optional.ofNullable(employeeMap.get(id))
```
---
## Stream API Usage
Used for:
* Filtering employees by department
* Searching employees by name
* Finding employees above a salary threshold
* Calculating average salary
Example:
```java
employees.stream()
         .filter(emp -> emp.getSalary() > salary)
```
## Custom Exceptions
### EmployeeNotFoundException
Example Message:
```text
Employee with ID 999 not found
```
### DuplicateEmployeeException
Example Message:
```text
Employee ID 101 already exists
```
## Exception Testing
### InputMismatchException
Occurs when an invalid data type is entered.
Example:
```text
Enter Employee ID: abc
```
## Output:
```text
Invalid input. Please enter the correct data type.
```
## Compilation and Execution
### Compile
```bash
javac *.java
```
### Run
```bash
java Main
```
## Sample Menu
```text
===== Employee Management System =====

1. Add Employee
2. Display All Employees
3. Search Employee By ID
4. Filter Employees By Department
5. Display Employees Above Salary
6. Remove Employee
7. Display Employee Count
8. Search Employee By Name
9. Display Average Salary
10. Exit
```
---
## Future Enhancements
* File-based data persistence
* Database integration
* Employee update functionality
* Graphical User Interface (GUI)
* Employee sorting and reporting features
