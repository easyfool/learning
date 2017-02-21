package com.wangfengbabe.learning_spring.beanbasic.innerBean;


class Person {

  private String name;
  private int age;

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

/**
 * Created by wangfeng on 20/02/2017.
 */
public class Customer {

  private Person person;

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }
}
