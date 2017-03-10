package com.wangfengbabe.learning_spring.springJdbc;

/**
 * Created by wangfeng on 10/03/2017.
 */
public interface CustomerDAO {

  public void insert(Customer customer);

  public Customer findByCustomerId(int customerId);

}
