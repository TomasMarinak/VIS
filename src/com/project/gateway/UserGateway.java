package com.project.gateway;

import com.project.models.Enums.EUser;
import com.project.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserGateway extends Gateway {
   private Connection connection ;
    public UserGateway(Connection connection, String name) throws SQLException {
        super( name);

        this.connection = connection;
    }

    public void save(Long id, EUser role, String name, String lastName,String email, String address) {
        String query =" insert into  users(id,role,name,lastName,email,address)  Values(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            connection.setAutoCommit(false);
            preparedStatement.setLong(1,id);
            preparedStatement.setString(2,role.toString());
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,lastName);
            preparedStatement.setString(5,email);
            preparedStatement.setString(6,address);

            preparedStatement.execute();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet find(Long id) {
        return super.find(id);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }


    public void update(Long id,EUser role, String name ,String lastName)
    {
        String query =" update  users set role="+role.toString()+", name="+name+" lasname="+lastName+"where id ="+id+ "";
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query);
            connection.setAutoCommit(false);
            preparedStatement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ResultSet findAll() {
        return super.findAll();
    }
}
