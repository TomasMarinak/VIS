package com.project.gateway;

import com.project.models.Enums.EOrientation;
import com.project.models.Enums.ESeat;

import java.sql.*;

public class SeatGateway {
    private Connection connection;

    public SeatGateway(Connection connection) {
        this.connection = connection;
    }

    public void delete (Long id){
        String query = "delete from seats where";
        query += ("id = " + id);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(ESeat state, Long id){
        String query = "update seats set state = "+"'"+state.toString()+"'"+ " where ";
        query += ("id = " + id);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(Long Id, ESeat state, int row, int column, EOrientation orientation){
        String query =" insert into seat (Id,State, Row, Column, Orientation) Values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query);
            connection.setAutoCommit(false);
            preparedStatement.setLong(1,Id);
            preparedStatement.setString(2,state.toString());
            preparedStatement.setInt(3,row);
            preparedStatement.setInt(4,column);
            preparedStatement.setString(5,orientation.toString());

            preparedStatement.execute();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ResultSet find(Long id) {
        String query = "select * from seats where ";
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
        // etc.
    }

    public ResultSet findAll() {
        String query = "select * from seats ";
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
