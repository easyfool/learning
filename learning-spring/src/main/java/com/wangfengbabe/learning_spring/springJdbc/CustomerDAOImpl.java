package com.wangfengbabe.learning_spring.springJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class CustomerDAOImpl implements CustomerDAO {

  private DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void insert(Customer customer) {
    String sql = "INSERT INTO CUSTOMER (CUSTOMER_ID,NAME,AGE) VALUES (?,?,?)";
    Connection connection = null;
    try {
      connection = dataSource.getConnection();
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, customer.getCustomerId());
      ps.setString(2, customer.getName());
      ps.setInt(3, customer.getAge());
      ps.execute();
      ps.close();
    } catch (SQLException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  @Override
  public Customer findByCustomerId(int customerId) {
    String sql = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";
    Connection connection = null;
    try {
      connection = dataSource.getConnection();
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, customerId);
      Customer customer = null;
      ResultSet resultSet = ps.executeQuery();
      if (resultSet.next()) {
        customer = new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
        resultSet.close();
        ps.close();
        return customer;
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return null;
  }
}
