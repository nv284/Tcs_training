package com.org.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect //Important to say this is an Aspect config class
public class BeforeAdvice {

  //execution(RETURN_TYPE PACKAGE.CLASS.METHOD(..PARAMETER_LIST))
  //execution(* PACKAGE.*.*(..))
  @Before("execution(* com.org.aop.*.add(..))")
  public void allDaoAddMethods(JoinPoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + joinPoint.getArgs());
    System.out.println(joinPoint.getTarget());
  }

  @Before("execution(* com.org.aop.*.*(..))")
  public void allDaoAnyMethod(JoinPoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + joinPoint.getArgs());
    System.out.println(joinPoint.getTarget());
  }
}

