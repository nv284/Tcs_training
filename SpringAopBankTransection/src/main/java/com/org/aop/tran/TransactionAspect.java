package com.org.aop.tran;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class TransactionAspect {

    @Before("execution(* com.org.aop.tran.*.*(..))")
    public void beforeTransaction() {
        System.out.println("Before transaction");
    }

    @After("execution(* com.org.aop.tran.*.*(..))")
    public void afterTransaction() {
        System.out.println("After transaction");
    }

    @AfterReturning("execution(* com.org.aop.tran.*.*(..))")
    public void afterReturningTransaction() {
        System.out.println("After returning from transaction");
    }

    @Around("execution(* com.org.aop.tran.*.*(..))")
    public Object aroundTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("Around transaction: Starting transaction");

        Object result = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Around transaction: Completed transaction in " + timeTaken + " ms");

        return result;
    }
}
