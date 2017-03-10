package com.wangfengbabe.learning_spring.springJdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

  @Override
  public void insert(Customer customer) {
    String sql = "INSERT INTO CUSTOMER (CUSTOMER_ID,NAME,AGE) VALUES (?,?,?)";
    getJdbcTemplate().update(sql, new Object[]{customer.getCustomerId(), customer.getName(), customer.getAge()});
  }

  @Override
  public Customer findByCustomerId(int customerId) {
    return null;
  }
}
