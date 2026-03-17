# Library Management System

A web-based **Library Management System** developed using **Java, JSP, Servlets, Hibernate, MySQL, and Apache Tomcat**.
This project allows librarians and students to manage books, issue books, and track returns.

---

# Features

* User Registration (Admin / Librarian / Student)
* Secure Login System
* Add New Books
* View Available Books
* Issue Books to Students
* Return Books
* Track Issued Books
* Dashboard for Librarian
* Clean UI with CSS

---

# Tech Stack

| Technology    | Usage                 |
| ------------- | --------------------- |
| Java          | Backend logic         |
| JSP           | Frontend pages        |
| Servlet       | Controller layer      |
| Hibernate     | ORM for database      |
| MySQL         | Database              |
| Apache Tomcat | Server                |
| HTML + CSS    | UI Design             |
| Maven         | Dependency management |

---

# Project Structure

```text
Library
│
├── src
│   └── main
│       ├── java
│       │   └── com.library
│       │       ├── config
│       │       │     HibernateUtil.java
│       │       │
│       │       ├── dao
│       │       │     BookDAO.java
│       │       │     IssueBookDAO.java
│       │       │     UserDAO.java
│       │       │
│       │       ├── entity
│       │       │     Book.java
│       │       │     IssueBook.java
│       │       │     User.java
│       │       │
│       │       └── servlet
│       │             LoginServlet.java
│       │             SignupServlet.java
│       │             AddBookServlet.java
│       │             IssueBookServlet.java
│       │             ReturnBookServlet.java
│
│       ├── resources
│       │     hibernate.cfg.xml
│
│       └── webapp
│             ├── css
│             │     style.css
│             │
│             ├── index.jsp
│             ├── login.jsp
│             ├── signup.jsp
│             ├── admin.jsp
│             ├── librarian.jsp
│             ├── student.jsp
│             ├── addBook.jsp
│             ├── issueBook.jsp
│             ├── returnBook.jsp
│             ├── viewBooks.jsp
│             ├── error.jsp
│             │
│             └── WEB-INF
│                   web.xml
│
└── pom.xml
```

---

# Database Setup

Create database in MySQL:

```sql
CREATE DATABASE librarydb;
USE librarydb;
```

---

## Users Table

```sql
CREATE TABLE users (
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(50),
password VARCHAR(50),
role VARCHAR(20)
);
```

---

## Books Table

```sql
CREATE TABLE books (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100),
author VARCHAR(100),
quantity INT
);
```

---

## Issue Books Table

```sql
CREATE TABLE issue_books (
id INT PRIMARY KEY AUTO_INCREMENT,
userId INT,
bookId INT,
issueDate DATE,
returnDate DATE
);
```

---

# Sample Data

```sql
INSERT INTO users(username,password,role) VALUES
('admin','admin123','ADMIN'),
('librarian','lib123','LIBRARIAN'),
('student','stu123','STUDENT');

INSERT INTO books(title,author,quantity) VALUES
('Clean Code','Robert C. Martin',5),
('Operating System Concepts','Abraham Silberschatz',4),
('Computer Networks','Andrew S. Tanenbaum',3);
```

---

# How to Run the Project

### 1 Install Requirements

* Java JDK 17+
* MySQL
* Apache Tomcat 10
* IntelliJ IDEA

---

### 2 Clone Repository

```bash
git clone https://github.com/yourusername/library-management-system.git
```

---

### 3 Configure Database

Edit:

```text
hibernate.cfg.xml
```

Set your MySQL credentials.

---

### 4 Build Project

```bash
mvn clean install
```

---

### 5 Run on Tomcat

Deploy project on **Apache Tomcat**.

Open in browser:

```text
http://localhost:8080/Library
```

---

# Application Flow

```text
User Signup
      ↓
User Login
      ↓
Dashboard
      ↓
Add / View Books
      ↓
Issue Book
      ↓
Return Book
```

---

# Screenshots

Add screenshots of:

* Login Page
* Signup Page
* Librarian Dashboard
* Issue Book Page
* View Books Table

---

# Future Improvements

* Book search feature
* Fine calculation for late returns
* Email notification
* Role-based access control
* Admin analytics dashboard

---

# Author

**Shivam**

BTech CSE Student
Java Full Stack & Backend Developer
