package com.wangfengbabe.learning_spring.aop;

/**
 * Created by wangfeng on 10/03/2017.
 */
public interface CustomerBo {

  void addCustomer();

  String addCustomerReturnValue();

  void addCustomerThrowException() throws Exception;

  void addCustomerAround(String name);

}
