#  Week 1 - Java Basics Assignments

##  Overview

This repository contains **Week 1 Java Basics assignments**, developed as part of Java training and internship practice.
The projects focus on strengthening core Java concepts including **Object-Oriented Programming (OOP), Collections Framework, Exception Handling, and Java 8 features like Stream API and Optional API**.

The repository includes two main console-based applications:

* 📚 Assignment 1: Library Management System
* 👨‍💼 Assignment 2: Employee Management System

These applications demonstrate modular coding, real-world problem-solving, and proper software design principles.

---

## 🎯 Objectives

* Understand and implement Object-Oriented Programming principles
* Work with Java Collections Framework effectively
* Implement custom exception handling for real-world scenarios
* Use Java 8 Stream API for data processing
* Use Optional class to avoid NullPointerException
* Develop menu-driven console applications
* Follow clean code and structured programming practices

---

## 📁 Project Structure

```
Week1-JavaBasics/
│
├── Assignment1-LibraryManagement/
│   ├── Book.java
│   ├── User.java
│   ├── Library.java
│   ├── LibraryException.java
│   ├── Main.java
│   └── README.md
│
└── Assignment2-EmployeeManagement/
    ├── src/
    │   ├── Employee.java
    │   ├── EmployeeManager.java
    │   ├── EmployeeNotFoundException.java
    │   ├── DuplicateEmployeeException.java
    │   └── Main.java
    └── README.md
```

---

## 📚 Assignment 1: Library Management System

### 🧩 Description

A console-based application used to manage library operations such as book management, issuing books, and returning books.

### ✨ Features

* Add new books to library
* View all available books
* Issue books to users
* Return books to library
* Handle invalid operations using custom exceptions

### 🛠 Concepts Used

* Classes and Objects
* Encapsulation
* Custom Exception Handling
* Basic input/output operations

---

## 👨‍💼 Assignment 2: Employee Management System

### 🧩 Description

A console-based employee management system that performs CRUD operations on employee records using Java Collections and advanced Java features.

### ✨ Features

* Add new employee
* Display all employees
* Search employee by ID
* Search employee by name
* Filter employees by department
* Display employees above a given salary
* Remove employee record
* Display total employee count
* Calculate average salary

### 🛠 Concepts Used

* Collections Framework (ArrayList, HashMap)
* Stream API (filter, map, collect)
* Optional Class
* Custom Exception Handling
* Menu-driven console application

---

## ⚠️ Exception Handling

### 📚 Library Management

* Handles invalid book operations using custom exceptions

### 👨‍💼 Employee Management

* `EmployeeNotFoundException` → When employee ID is not found
* `DuplicateEmployeeException` → When duplicate employee ID is entered
* `InputMismatchException` → When invalid input is provided

---

## 🚀 How to Run the Project

### 🔹 Step 1: Compile Java files

```bash
javac *.java
```

---

### 🔹 Step 2: Run Library Management System

```bash
java Main
```

---

### 🔹 Step 3: Run Employee Management System

```bash
cd src
javac *.java
java Main
```

---

## 💡 Key Learnings

This project helped in understanding:

* Real-world application of OOP concepts
* Efficient data handling using Collections
* Functional programming style using Streams
* Safe null handling using Optional
* Importance of Exception Handling in applications
* Structuring Java projects in modular format

---

## 📈 Future Enhancements

* File-based data persistence using text/CSV files
* Database integration using MySQL
* Graphical User Interface (GUI) using JavaFX or Swing
* Role-based access system (Admin/User)
* Advanced reporting and sorting features

---

