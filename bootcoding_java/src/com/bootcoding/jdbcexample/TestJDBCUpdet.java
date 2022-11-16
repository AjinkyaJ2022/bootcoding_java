package com.bootcoding.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCUpdet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //load and register the driver
        Class.forName("org.postgresql.Driver");

        //establish the connection
        Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

        //create Statement Object
        Statement statement= conn.createStatement();

        //execute query
        String sql="update emp set sal=sal-100";
        int count=statement.executeUpdate(sql);
        System.out.println("Rows Updated :"+count);
        if(conn!=null){
            conn.close();
        }

    }
}
