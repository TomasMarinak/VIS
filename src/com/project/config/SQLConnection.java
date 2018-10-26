package com.project.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/theatre";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASSWORD = "1234";


    public  static Connection getConnection() throws SQLException {
        try {
            Connection connection = null;
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to database");
            return connection;
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }



    }

}
