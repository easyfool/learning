package com.wangfengbabe.learning_spring.springJdbc;

/**
 * Created by wangfeng on 10/03/2017.
 */
public class Customer {

  int customerId;
  String name;
  int age;

  @Override
  public String toString() {
    return "BeanScope{" +
        "customerId=" + customerId +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public int getCustomerId() {
    return customerId;
  }

  public Customer(int customerId, String name, int age) {
    this.customerId = customerId;
    this.name = name;
    this.age = age;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
