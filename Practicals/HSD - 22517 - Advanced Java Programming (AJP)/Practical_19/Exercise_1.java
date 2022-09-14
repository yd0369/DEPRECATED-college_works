package com.yash_desai.AJP_22517.Practical_19;

import java.sql.*;

public class Exercise_1 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Statement SQL_QUERY = DB_CON.createStatement();
        ResultSet RES_SET = SQL_QUERY.executeQuery("select * from student order by roll_number asc");
        System.out.println("Roll Number \t\tName \t\tPercentage");
        while(RES_SET.next())
            System.out.println(RES_SET.getInt(1)+"\t\t\t\t\t"
                    +RES_SET.getString(2)+"\t\t"
                    +RES_SET.getInt(3));
        System.out.println("\nQuery Executed Successfully...");
        DB_CON.close();
    }
}