package com.wangfengbabe.learning_spring.aop.simple;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class HijackAfterReturningMethod implements AfterReturningAdvice {


  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
    System.out.println("HijackAfterReturningMethod : after method hijacked");
  }
}
