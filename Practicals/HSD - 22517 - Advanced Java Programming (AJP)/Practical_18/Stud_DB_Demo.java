package com.yash_desai.AJP_22517.Practical_18;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import oracle.jdbc.driver.OracleDriver;

public class Stud_DB_Demo {
    public static void main(String[] args) throws SQLException{
        Connection DB_CON = DriverManager.getConnection(
           "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Statement SQL_QUERY = DB_CON.createStatement();
        String TMP = "insert into student(ROLL_NUMBER,NAME,PERCENTAGE) values(";
        Scanner S = new Scanner(System.in);
        System.out.print("Roll Number : ");
        TMP += S.nextInt() + ",";
        System.out.print("Name : ");
        TMP += "'" +S.next() + "'" + ",";
        System.out.print("Percentage : ");
        TMP += S.next() + ")";
        SQL_QUERY.executeQuery(TMP);
        System.out.println("Row Inserted...");
        DB_CON.close();
    }
}