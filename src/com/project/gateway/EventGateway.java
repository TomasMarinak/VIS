package com.project.gateway;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventGateway extends  Gateway {

    Connection connection;
    public EventGateway(Connection connection, String name) {
        super(connection, name);
    }

    public void update(String  name, Long id, String description){
        String query = "update events set name = "+"'"+name+"'"+ " where ";
        query += ("id = " + id);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Long Id, LocalDateTime dateOfPerformance,String name, String description){
        String query =" insert into events (Id,date,name,description) Values(?,?,?,?)";
        LocalDate date = dateOfPerformance.toLocalDate();
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            connection.setAutoCommit(false);
            preparedStatement.setLong(1,Id);
            preparedStatement.setDate(2,new Date(10000000000000L));
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,description);
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

    @Override
    public ResultSet findAll() {
        return super.findAll();
    }
}
