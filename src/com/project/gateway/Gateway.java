package com.project.gateway;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Gateway<T> {
    private Connection connection;
    private T type;
    public Gateway(Connection connection) {
        this.connection = connection;
    }

    public void save (T t){

    }

    public ResultSet find (Long id){

        return  null ;
    }

    public void delete(Long id ){
        String query = "delete from "+ Type.class+" where ";
        query += ("id = " + id);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //preparedStatement.execute();
            System.out.println(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update (T t){

    }

}
