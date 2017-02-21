package com.wangfengbabe.learning_spring;

import java.util.Date;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class Customer {

  private Date date;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Customer{" + "date=" + date + '}';
  }
}
