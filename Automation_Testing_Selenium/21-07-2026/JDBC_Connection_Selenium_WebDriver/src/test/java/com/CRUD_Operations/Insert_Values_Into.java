package com.CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Values_Into{
    public static void main(String[] args) throws SQLException {

        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "root123";

        Connection con = DriverManager.getConnection(databaseURL, user, password);
        Statement stmt = con.createStatement();

        String query = "INSERT INTO book_detl VALUES ('AI003','SeleniumAI','Che','Raghavendra','ABC','S','2026',500)";

        int result = stmt.executeUpdate(query);

        System.out.println(result + " Record Inserted Successfully");

        con.close();
    }
}
