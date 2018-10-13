package com.project.config;
import java.sql.*;
public class Connection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";

    //  Database credentials
    static final String USER = "username";
    static final String PASSWORD = "password";

    public void connect(){
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            con= (Connection) DriverManager.getConnection(
                    DB_URL,USER,PASSWORD);
//here sonoo is database name, root is username and password
            stmt=((java.sql.Connection) con).createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            rs.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

