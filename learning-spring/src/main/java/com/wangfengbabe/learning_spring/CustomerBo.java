package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 18/02/2017.
 */
public interface CustomerBo {

  void addCustomer();

  String addCustomerReturnValue();

  void addCustomerThrowException() throws Exception;

  void addCustomerAround(String name);


}
