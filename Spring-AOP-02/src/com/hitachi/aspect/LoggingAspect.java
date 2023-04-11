package com.hitachi.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("allGetters()")
    public void logginPopUp(){
        System.out.println("Enter your user name and password !");
    }

    @Pointcut("execution(* getMainPage())")
    public void allGetters(){}
}
