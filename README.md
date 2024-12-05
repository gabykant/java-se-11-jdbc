# Person Management in Java using PostgreSQL and Maven

## Description
This project is a Java SE 11 application designed to manage a database of people using PostgreSQL. It showcases fundamental software development concepts and technologies, including:

__Java SE 11:__ Object-oriented programming for data manipulation.

__PostgreSQL:__ Relational database management for storing and retrieving information.

__JDBC:__ Connecting to the database and executing SQL queries.

__Maven:__ A project management and build tool used to structure the application and manage dependencies.

__Unit Testing with JUnit:__ Ensuring the robustness of the application's core methods and functionalities.

__Configuration Files:__ Leveraging .properties files to manage database connection settings.

The main objective of this project is to demonstrate how to connect to a database using JDBC and implement basic CRUD (Create, Read, Update, Delete) operations on a PostgreSQL table.

## Features
- Add a person to the database.
- Retrieve a list of people from the database.
- Follow best practices for managing database connections.
- Unit tests to validate business logic. 

## Technologies and Tools
- Language: Java SE 11
- Database: PostgreSQL
- Project Management Framework: Maven
- Libraries:
  - JDBC for database operations
  - JUnit 5 for unit testing
- Development Tools:
  - IDE: VS Code
  - Git for version control

## How to Run
+ Create a PostgreSQL database named testpersonne.
+ Configure the application.properties file with your database credentials (username, password, port).
+ Use Maven commands to compile and run the application:
  + _mvn clean compile_ to compile the project.
  + _mvn exec:java_ to execute the code.
  + _mvn clean compile exec:java_ to compile and execute the code
+ Test CRUD functionalities.
