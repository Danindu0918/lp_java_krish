package com.example.pos_servlet.dao;

import com.example.pos_servlet.model.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {

    public int registerCustomer(Customer customer) throws ClassNotFoundException{
        String INSERT_USERS_SQL = "INSERT INTO Customer" + "(id, first_name, last_name, address, contact) VALUES" +
                "(?, ?, ?, ? ,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSl=false", "root", "root");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);{
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, customer.getFirst_name());
                preparedStatement.setString(3, customer.getLast_name());
                preparedStatement.setString(4, customer.getAddress());
                preparedStatement.setString(5, customer.getContact());

                System.out.println(preparedStatement);
                result =preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return result;
    }
}
