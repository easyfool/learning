package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class CustomerService {

  private String name;
  private String url;

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

  public void printName() {
    System.out.println("customer name " + name);

  }

  public void printUrl() {
    System.out.println("customer url " + url);

  }

  public void printThrowException() {
    throw new IllegalArgumentException();
  }


}
