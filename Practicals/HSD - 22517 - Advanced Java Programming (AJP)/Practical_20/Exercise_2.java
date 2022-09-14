package com.yash_desai.AJP_22517.Practical_20;

import java.sql.*;

public class Exercise_2 {
    public static void main(String[] args) throws SQLException {
        Connection DB_CON = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:raidenfcdb", "c##yash", "pop");
        PreparedStatement PREP_SQL_QUERY = DB_CON.prepareStatement("delete from PRODUCTS_DB where price > 500 and id='P1234'");
        int tmp = PREP_SQL_QUERY.executeUpdate();
        System.out.println("Data ["+tmp+"] Deleted Successfully....");
        DB_CON.close();
    }
}