package com.wangfengbabe.learning_spring;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by wangfeng on 18/02/2017.
 */
public class HijackAfterMethod implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
    System.out.println("after method advice");
  }
}
