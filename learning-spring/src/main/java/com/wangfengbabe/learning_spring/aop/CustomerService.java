package com.wangfengbabe.learning_spring.aop;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class CustomerService {

  private String name;
  private String url;

  @Override
  public String toString() {
    return "CustomerService{" +
        "name='" + name + '\'' +
        ", url='" + url + '\'' +
        '}';
  }

  public void printName() {
    System.out.println("customer name :" + name);
  }

  public void printURL() {
    System.out.println("customer website :" + url);
  }

  public void printThrowException() {
    throw new IllegalArgumentException();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
