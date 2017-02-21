package com.wangfengbabe.learning_spring.springDI.constructorInjection;

import com.wangfengbabe.learning_spring.looselycouple.IOutputGenerator;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class Person {

  private String name;

  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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
