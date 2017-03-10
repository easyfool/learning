package com.wangfengbabe.learning_spring.aop.simple;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("HijackBefore method: before method  hijacked");
  }
}
