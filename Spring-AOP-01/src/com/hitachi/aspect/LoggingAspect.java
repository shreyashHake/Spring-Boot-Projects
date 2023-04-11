package com.hitachi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    /**
     * both @Before and @After has same functionally and working except :
     * @Before : executes before the method
     * @Afer : executes after the method don't care about the exception
     * @AfterReturn : executes after the method run successfully without any exception
     * execution : takes parameters as 'method' name
     * within : takes parameters as 'class' name
     * args : take 'class' as parameter (used for those methods which takes 'some' arguments . . . .)
     */

    /** 1. for any
     @Before("execution(public String getName())")
     public void loggingAdvice1() {
     System.out.println("Run advice1, run before any method!");
     }*/

    /** 2. only specific
     @Before("execution(public String com.hitachi.model.Circle.getName())")
     public void loggingAdvice2() {
     System.out.println("Run advice2, run only before circle's getName() method!");
     }*/


    /** 3. Wild cards : here * act as wildcard
     @Before("execution(public * get*())")
     public void loggingAdvice2() {
     System.out.println("Run advice3, using wild card");
     }*/

    /**
     * 4.1  Pointcuts :
     * //    @Before("allGetters()")
     * //    @Before("allCircleMethods")
     *
     * @Before("allGetters() && allCircleMethods()")
     * public void loggingAdvice() {
     * System.out.println("Run advice, using Pointcut");
     * }
     * //    @Before("allGetters()")
     * //    @Before("allCircleMethods")
     * @Before("allGetters() && allCircleMethods()")
     * public void secondAdvice() {
     * System.out.println("Run advice, using Pointcut");
     * }
     * @Pointcut("execution(public * get*())")
     * public void allGetters(){}
     * @Pointcut("execution(* * com.hitachi.model.Circle.*)")
     * public void allCircleMethods(){}
     */

    /**4.2 within :
     @Before("allCircleMethods()") public void loggingAdvice() {
     System.out.println("Run advice,'within' using Pointcut");
     }

     @Before("allCircleMethods()") public void secondAdvice() {
     System.out.println("Run advice, 'within' using Pointcut");
     }

     @Pointcut("within(com.hitachi.model.Circle)") public void allCircleMethods() {
     }*/

    /**
     //5. JoinPoint
     @Before("allCircleMethods()") public void loggingAdvice(JoinPoint joinPoint) {
     System.out.println("Object of class : " + joinPoint.getTarget());
     System.out.println("Code is getting executed from : " + joinPoint.toString());
     }

     @Pointcut("within(com.hitachi.model.Circle)") public void allCircleMethods() {
     }*/

    /**
     //6.1 args :
     @Before("args(String)") public void loginAdvice(){
     System.out.println("1. Methods, which take 'String' as arguments are called !");
     }

     //6.2 args
     @Before("args(name)") public void loginAdvice(String name){
     System.out.println("2. Methods, which take 'String' as arguments are called, the value is : " + name);
     }*/

    /** 7. After
     @After("args(name)") public void loggingAdvice(String name){
     System.out.println("After annotation is used to set name : " + name);
     }*/

    /** 8. Custom annotation
     @After("@annotation(com.hitachi.aspect.Loggable)") public void loginAdvice() {
     System.out.println("Called via custom annotation from LoggingAspect");
     }*/

    /**
     * 9. AOP using XML
     */
    @Before("allGetters()")
    public void loggingAdvice() {
        System.out.println("Run advice, using XML");
    }

    @Pointcut("execution(public * get*())")
    public void allGetters() {
    }

}
