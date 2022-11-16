package com.bootcoding.jdbcexample;

import java.sql.*;

public class TestJDBCSelect {
    public static void main(String[] args) {

        Connection connection=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement statement= connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from emp");

           /* while (rs.next()){
                System.out.println("Empno :"+rs.getInt(1));
                System.out.println("Ename :"+rs.getString(2));
                System.out.println("Job :"+rs.getString(3));
                System.out.println("Manager :"+rs.getInt(4));
                System.out.println("Sal :"+rs.getInt(5));
                System.out.println("Comm :"+rs.getInt(6));
                System.out.println("Deptno :"+rs.getString(7));
            }*/
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
