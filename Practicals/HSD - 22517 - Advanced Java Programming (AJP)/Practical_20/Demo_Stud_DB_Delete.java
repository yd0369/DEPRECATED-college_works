package com.yash_desai.AJP_22517.Practical_20;

import java.sql.*;
import java.util.Scanner;

public class Demo_Stud_DB_Delete {
    public static void main(String[] args) throws SQLException{
        Connection DB_CON = DriverManager.getConnection(
           "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Scanner S = new Scanner(System.in);
        PreparedStatement PREP_SQL_QUERY = DB_CON.prepareStatement("delete from student where ?=?");
        System.out.print("Select form which parameter you want to delete : " +
                "\n1. Roll Number\n2. Name\n3. Percentage");
        switch (S.nextByte()) {
            case 1: System.out.print("Roll Number : ");  PREP_SQL_QUERY.setString(1, "Roll_Number"); break;
            case 2: System.out.print("Name : ");         PREP_SQL_QUERY.setString(1, "Name"); break;
            case 3: System.out.print("Percentage : ");   PREP_SQL_QUERY.setString(1, "Percentage"); break;
        }
        PREP_SQL_QUERY.setString(2, S.next());
        System.out.println("Record(s) Deleted Successfully....");
        DB_CON.close();
    }
}