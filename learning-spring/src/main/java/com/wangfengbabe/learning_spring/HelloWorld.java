package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 17/02/2017.
 */
public class HelloWorld {

  private String message;
  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void sayHello() {
    System.out.println(message + " " + address);
  }
}
