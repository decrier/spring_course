package com.example.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* *(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void returnMagazine())")
    private void returnMagazineFromUniLibrary() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void AllMethodsExceptReturnMagazineFromUniLibrary() {}

    @Before("AllMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
    }

    //-------------------------------------------------------------------
//    @Pointcut("execution(* get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//
//
//    @Pointcut("execution(* take*(..))")
//        private  void allTakeMethodsFromUniLibrary() {}


    //------------------------------------------------------------------

//    @Pointcut("execution(* get*(..))")
//    private void allGetMethods() {}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice(): attempt to get book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights to receive books/magazines");
//    }

}
