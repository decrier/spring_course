package com.example.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandligAspect {

    @Before("com.example.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void begoreAddExceptionHandlingAdvice() {
        System.out.println("begoreAddExceptionHandlingAdvice: catching exceptions by attempts to take a book/magazine");
    }
}
