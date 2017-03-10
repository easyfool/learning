package com.wangfengbabe.learning_spring.aop.simple;

import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wangfeng on 09/03/2017.
 */
public class HijackAroundMehod implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("Method name :" + methodInvocation.getMethod().getName());
    System.out.println("method arguments :" + Arrays.toString(methodInvocation.getArguments()));
    System.out.println("HijackAroundMethod :" + "Before method hijacked");
    try {
      Object result = methodInvocation.proceed();
      System.out.println("HijackAround method : After method hijacked");
      return result;
    } catch (IllegalArgumentException e) {
      System.out.println("HijackAround method : Throw Exception hijaced");
      throw e;
    }

  }
}
