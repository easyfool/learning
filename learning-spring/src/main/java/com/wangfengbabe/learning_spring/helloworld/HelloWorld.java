package com.wangfengbabe.learning_spring.helloworld;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class HelloWorld {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printHello() {
    System.out.println("hello " + name);
  }
}
