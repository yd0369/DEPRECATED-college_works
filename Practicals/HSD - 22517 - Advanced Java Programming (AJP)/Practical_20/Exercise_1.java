package com.yash_desai.AJP_22517.Practical_20;

import java.sql.*;

public class Exercise_1 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        Statement SQL_QUERY = DB_CON.createStatement();
        ResultSet RES_SET = SQL_QUERY.executeQuery("select roll_number from student where name='Jack'");
        RES_SET.next();
        PreparedStatement PREP_SQL_QUERY = DB_CON.prepareStatement(
                "update student set name='John' where roll_number="+RES_SET.getString(1));
        if(PREP_SQL_QUERY.executeUpdate() != 0)
            System.out.println("Query Executed Successfully..."+"\nName Changed [ Jack ->> John ]");
        else System.out.println("Query Execution Failed...");
        DB_CON.close();
    }
}