package com.yash_desai.AJP_22517.Practical_18;

import java.sql.*;

public class Exercise_2 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Statement SQL_QUERY = DB_CON.createStatement();
        ResultSet Result_Set = SQL_QUERY.executeQuery("select NAME,ROLL_NUMBER from STUDENT where PERCENTAGE > 70");
        System.out.println("Student having more than 70 percentage are :\n");
        while(Result_Set.next())
            System.out.println(Result_Set.getString(1)+"\t("+Result_Set.getString(2)+")");
        DB_CON.close();
    }
}
