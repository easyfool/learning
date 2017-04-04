package com.wangfengbabe.learning_spring.springmvc.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by wangfeng on 13/03/2017.
 */
@XmlRootElement(name = "coffee")
public class Coffee {

  String name;

  int price;

  public String getName() {
    return name;
  }

  @XmlElement
  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  @XmlElement
  public void setPrice(int price) {
    this.price = price;
  }

  public Coffee() {

  }

  public Coffee(String name, int price) {

    this.name = name;
    this.price = price;
  }
}
