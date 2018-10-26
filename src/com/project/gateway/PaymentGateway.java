package com.project.gateway;


import com.project.models.Enums.EPayment;
import com.project.models.Enums.ESeat;
import com.project.models.Payment;

import java.sql.*;

public class PaymentGateway {

    private Connection connection;

    public PaymentGateway(Connection connection) {
        this.connection = connection;
    }

        public void delete (Long id){
            String query = "delete from payment where";
            query += ("id = " + id);
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void update(EPayment state, Long id){
        String query = "update payment set state = "+"'"+state.toString()+"'"+ " where ";
            query += ("id = " + id);

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    public void save( Long Id,EPayment state, Double amount,String currency, Long customerId){
        String query =" insert into payment (Id,State, Amount, Currency, Customer_id) Values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement  = connection.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
            connection.setAutoCommit(false);
           preparedStatement.setLong(1,Id);
            preparedStatement.setString(2, state.toString());
            preparedStatement.setDouble(3,amount);
            preparedStatement.setString(4,currency);
            preparedStatement.setLong(5,customerId);
            preparedStatement.execute();
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ResultSet find(Long id) {
        String query = "select * from payment where ";
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
        String query = "select * from payment ";
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
