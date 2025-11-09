# OnlineShoppingCartSystem
A Java-based Online Shopping Cart System using Swing, JDBC, and MySQL demonstrating OOP, Exception Handling, and GUI Programming concepts.
🛒 Online Shopping Cart System

A Java-based desktop application that simulates an online shopping cart using Swing (GUI), JDBC, and MySQL.
The project demonstrates Object-Oriented Programming (OOP) principles, Exception Handling, Multithreading, and Database Connectivity in Java.

🚀 Project Overview

The Online Shopping Cart System enables users to:

View available products from a MySQL database

Add items to a virtual cart

Proceed to checkout, which automatically updates stock in the database

The system is modular, easy to use, and developed purely in Java, making it ideal for demonstrating integration between GUI and database layers.

🧩 Key Features

✅ Object-Oriented Design — Modular structure with encapsulated classes
✅ JDBC Integration — Connects to MySQL for persistent data storage
✅ Swing GUI — User-friendly desktop interface
✅ Exception Handling — Prevents crashes from invalid input or DB errors
✅ Multithreading — Handles checkout process efficiently
✅ MVC Structure — Clear separation between data, logic, and UI layers

🧱 System Architecture

Architecture Layers:

Frontend (Swing GUI) – Displays products, cart, and checkout

Backend (Java Classes) – Handles cart logic, product management, and threading

Database (MySQL) – Stores product details and manages stock

Architecture Flow:

User → GUI (Swing) → Business Logic (Java) → Database (MySQL via JDBC)


📊 (Include your architecture diagram image here)

🧠 Technology Stack
Layer	Technology
Language	Java (JDK 8+)
GUI Framework	Swing
Database	MySQL
Connector	MySQL Connector/J
IDE	Eclipse / IntelliJ IDEA
Version Control	Git & GitHub
⚙️ Modules
Module	Description
Module 1 – Product Management	Defines Product class with ID, name, price, and stock. Demonstrates constructors, methods, and encapsulation.
Module 2 – Cart Management	Implements cart operations, handles exceptions, and uses Java collections.
Module 3 – Checkout & Synchronization	Demonstrates generics, multithreading, and synchronized stock updates.
Module 4 – Database Connectivity	Establishes connection with MySQL using JDBC for CRUD operations.
Module 5 – GUI Programming	Builds the Swing interface for product listing, cart, and checkout features.
🗄️ Database Setup

Database Name: onlineshop

Create Database and Table
CREATE DATABASE onlineshop;
USE onlineshop;

CREATE TABLE products (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  description VARCHAR(255),
  price DOUBLE,
  stock INT
);

Insert Sample Data
INSERT INTO products (name, description, price, stock) VALUES
('Wireless Mouse', 'Ergonomic 2.4GHz wireless mouse', 599, 10),
('Keyboard', 'Mechanical backlit keyboard', 999, 5),
('USB-C Cable', 'Fast charging USB Type-C cable', 299, 20),
('Laptop Stand', 'Adjustable aluminum stand', 1499, 3);

Verify Data
SELECT * FROM products;

🖥️ Installation & Execution
Step 1: Clone the Repository
git clone https://github.com/Aishwarya-26-K/OnlineShoppingCartSystem.git
cd OnlineShoppingCartSystem

Step 2: Configure Database Connection

Open DBConnector.java and set your MySQL credentials:

private static final String DEFAULT_USER = "root";
private static final String DEFAULT_PASS = "your_password_here";

Step 3: Add MySQL Connector

Download and add the mysql-connector-j.jar file to your project classpath.

Step 4: Run the Application

Run the following class:

App.java


✅ The Swing GUI will open — you can now:

Select a product

Add to cart

Click Checkout to confirm purchase

Stock updates will be reflected in the database automatically.

🧮 Sample Output

Console Output:

Starting Online Shopping Cart System (GUI)...
MySQL JDBC Driver loaded successfully.
Products loaded from database.
Checkout successful! Stock updated.


GUI Windows:

Product List View

Add to Cart Confirmation

Checkout Success Popup

Updated Stock in MySQL Table

📸 (You can add your screenshots here later)

🧩 Folder Structure
OnlineShoppingCartSystem/
├── src/main/java/com/myshop/OnlineShoppingCart/
│   ├── App.java
│   ├── model/
│   │   ├── Product.java
│   │   ├── Cart.java
│   │   └── CartItem.java
│   ├── dao/
│   │   ├── DBConnector.java
│   │   └── ProductDAO.java
│   ├── service/
│   │   ├── Order.java
│   │   ├── OrderProcessor.java
│   │   └── OrderService.java
│   └── ui/
│       └── ShopSwingUI.java
└── OnlineShoppingCart.sql

🧠 Concepts Demonstrated

OOP Principles: Encapsulation, Inheritance, Abstraction, Polymorphism

Exception Handling: Try–catch, custom exception handling

Generics: Generic collections and repositories

Multithreading: ExecutorService for concurrent checkouts

Database Connectivity: CRUD using JDBC

GUI Design: Swing framework and event-driven programming

🏁 Result

The Online Shopping Cart System successfully demonstrates Java’s object-oriented concepts along with real-time database interaction.
It serves as a complete educational mini project for understanding how standalone desktop applications communicate with databases.

🔮 Future Enhancements

Add user authentication (login & registration)

Add admin panel to manage products

Integrate payment gateway simulation

Migrate GUI to JavaFX or Spring Boot + React

Host application with cloud database (AWS/RDS)

🧾 References

Oracle Java Documentation

MySQL JDBC Driver Documentation

TutorialsPoint – JDBC and Swing

GitHub Docs – Using Git and GitHub Desktop

https://docs.oracle.com/javase

https://www.mysql.com

👩‍💻 Author

Developed by Aishwarya K as part of the Object-Oriented Programming Mini Project (Experiment No. 11)
Department of Artificial intelligence and data Science
