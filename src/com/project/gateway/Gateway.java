package com.project.gateway;

import java.lang.reflect.Type;
import java.sql.*;


public class Gateway{
    private Connection connection;
    private String name;
    public Gateway(Connection connection,String name) {
        this.connection = connection;
        this.name = name;
    }


    public ResultSet find (Long id){

        String query = "select * from "+this.name+" where ";
        ResultSet res = null;
        query += ("id = " + id);
        // use c to add conditions to query
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            res = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // for each row in res add a customer object to result
        return res;

    }

    public void delete(Long id ){
        String query = "delete from "+ this.name+" where ";
        query += ("id = " + id);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //preparedStatement.execute();
            System.out.println(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ResultSet findAll() {
        String query = "select * from "+ this.name+ "";
        ResultSet res = null;
        // use c to add conditions to query
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            res = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // for each row in res add a customer object to result
        return res;
        // etc.
    }

}
