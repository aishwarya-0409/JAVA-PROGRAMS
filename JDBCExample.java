/*
 * Algorithm for Fetching Data using JDBC
 *
 * NOTE: The JDBC-ODBC bridge is deprecated and is not available in Java 8 and later versions.
 * It is recommended to use a standard JDBC driver for your specific database (e.g., MySQL, PostgreSQL, etc.).
 * This program provides a modern JDBC approach using the MySQL Connector/J driver as an example.
 *
 * 1.  Ensure you have the JDBC driver JAR file in your project's classpath. (e.g., MySQL Connector/J).
 * 2.  Establish a connection to the database using the `DriverManager.getConnection()` method.
 * 3.  Create a `Statement` object to execute SQL queries.
 * 4.  Execute a `SELECT` query using `statement.executeQuery()`. This returns a `ResultSet` object.
 * 5.  Iterate through the `ResultSet` using a `while (resultSet.next())` loop.
 * 6.  Inside the loop, retrieve data from each column using methods like `getString()`, `getInt()`, etc., by column name or index.
 * 7.  Print the fetched data.
 * 8.  Crucially, close all resources (`ResultSet`, `Statement`, and `Connection`) in a `finally` block or using a try-with-resources statement to prevent resource leaks.
 *
 * Pseudocode
 *
 * function fetchDataFromDatabase():
 * try:
 * conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "user", "password")
 * stmt = conn.createStatement()
 * resultSet = stmt.executeQuery("SELECT * FROM employees")
 * while resultSet.next():
 * id = resultSet.getInt("id")
 * name = resultSet.getString("name")
 * print id, name
 * catch (Exception e):
 * print e.getMessage()
 * finally:
 * close resultSet, stmt, conn
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "2404aishu2404";

    public static void main(String[] args) {
        // Using try-with-resources to automatically close resources
        try (Connection conn = DriverManager.getConnection(DB_URL, username, password);
             Statement stmt = conn.createStatement()) {

            System.out.println("Connected to the database successfully.");

            // SQL query to fetch data
            String sql = "SELECT id, name, age FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            // Loop through the result set and print the data
            System.out.println("Fetching data from 'employees' table:");
            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");

                System.out.printf("ID: %d, Name: %s, Age: %d\n", id, name, age);
            }

        } catch (SQLException e) {
            System.err.println("Database connection or query failed!");
            e.printStackTrace();
        }
    }
}
