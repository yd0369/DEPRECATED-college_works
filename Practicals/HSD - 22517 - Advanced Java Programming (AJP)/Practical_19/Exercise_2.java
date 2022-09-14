package com.yash_desai.AJP_22517.Practical_19;

import java.sql.*;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Scanner S = new Scanner(System.in);
        String QUERY = "update student set name = ?,percentage = ? where roll_number = ?";
        PreparedStatement PREP_SQL_QUERY = DB_CON.prepareStatement(QUERY);
        System.out.print("Roll Number of student to update elements : ");
        PREP_SQL_QUERY.setInt(3,S.nextInt());
        System.out.print("[UPDATE] Name : ");
        PREP_SQL_QUERY.setString(1, S.next());
        System.out.print("[UPDATE] Percentage : ");
        PREP_SQL_QUERY.setInt(2, S.nextInt());
        PREP_SQL_QUERY.executeUpdate();
        System.out.println("Data Updated Successfully....");
        DB_CON.close();
    }
}
