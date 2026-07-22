package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTest {

    @Test
    public void establishDatabaseConnection() throws ClassNotFoundException, SQLException {

        // Database connection details
        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "root123";

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(databaseURL, user, password);

        // Create Statement
        Statement stmt = con.createStatement();

        // SQL Query
        String query = "SELECT * FROM SeleniumAutomation.book_detl";

        // Execute Query
        ResultSet rs = stmt.executeQuery(query);

        // Read Data
        while (rs.next()) {
            String author = rs.getString("author");
            String title = rs.getString("title");

            System.out.println("Author : " + author + ", Title : " + title);
        }

        // Close resources
        rs.close();
        stmt.close();
        con.close();
    }
}