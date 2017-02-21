package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class CustomerBoImpl implements CustomerBo {

  @Override
  public void addCustomer() {
    System.out.println("addCustomer() is running");
  }

  @Override
  public String addCustomerReturnValue() {
    System.out.println("addCustomerReturnValue() is running");
    return "abc";
  }

  @Override
  public void addCustomerThrowException() throws Exception {
    System.out.println("addCustomerThrowsException() is running");
    throw new Exception("generic error");

  }

  @Override
  public void addCustomerAround(String name) {
    System.out.println("addCustomerAround() is running, arg is " + name);
  }
}
