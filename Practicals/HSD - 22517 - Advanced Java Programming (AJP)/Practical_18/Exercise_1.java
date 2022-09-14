package com.yash_desai.AJP_22517.Practical_18;

import java.sql.*;

public class Exercise_1 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Statement SQL_QUERY = DB_CON.createStatement();
        SQL_QUERY.executeQuery("create table employee(emp_id int, emp_name varchar2(100))");
        System.out.println("\"EMPLOYEE\" table created successfully...");
        DB_CON.close();
    }
}