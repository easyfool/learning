package com.wangfengbabe.learning_spring.aop.simple;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class HijackThrowExceptionMethod implements ThrowsAdvice {

  public void afterThrowing(IllegalArgumentException e) throws Throwable {
    System.out.println("HijackThrowException : Throw Exception hijacked");

  }


}
