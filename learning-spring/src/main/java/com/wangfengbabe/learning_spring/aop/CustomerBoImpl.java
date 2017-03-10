package com.wangfengbabe.learning_spring.aop;


/**
 * Created by wangfeng on 10/03/2017.
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
    System.out.println("addCustomerThrowException() is running");
    throw new Exception("Generic Error");
  }

  @Override
  public void addCustomerAround(String name) {
    System.out.println("addCustomerAround() is running ,args " + name);
  }
}
