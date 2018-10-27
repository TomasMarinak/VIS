package com.project.gateway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HallGateway extends  Gateway {
        private Connection connection;
    public HallGateway(Connection connection, String name) throws SQLException {
        super( name);
        this.connection = connection;
    }

    @Override
    public ResultSet find(Long id) {
        return super.find(id);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    public void update(String name, String address, Long id){
        String query = "update halls set name = "+"'"+name+"' "+ " where ";
        query += ("id = " + id);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save( Long Id,String name, String address){
        String query =" insert into halls (Id, name, address) Values(?,?,?)";
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            connection.setAutoCommit(false);
            preparedStatement.setLong(1,Id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3, address);
            preparedStatement.execute();
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
