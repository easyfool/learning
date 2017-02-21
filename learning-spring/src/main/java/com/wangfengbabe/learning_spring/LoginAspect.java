package com.wangfengbabe.learning_spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wangfeng on 18/02/2017.
 */
@Aspect
public class LoginAspect {

  @Before("execution(* com.wangfengbabe.learning_spring.CustomerBo.addCustomer(..))")
  public void logBefore(JoinPoint joinPoint) {
    System.out.println("logBefore() is running");
    System.out.println("hijacked : " + joinPoint.getSignature().getName());
    System.out.println("*********");
  }

}
