package com.wangfengbabe.learning_spring;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class HijackAfterThrowingExceptionMethod implements ThrowsAdvice {

  public void afterThrowing(IllegalArgumentException e) throws Throwable {
    System.out.println("HijackThrowException : Throw exception hijacked!");
  }

}
