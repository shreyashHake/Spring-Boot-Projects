package com.hitachi;

import com.hitachi.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

//        System.out.println("1. Can give advice to any method of any class with the provide name : ");
//        System.out.println(shapeService.getCircle().getName());
//        System.out.println(shapeService.getTriangle().getName());

//        System.out.println("2. Only selected method from the class : ");
//        System.out.println(shapeService.getTriangle().getName());

//        System.out.println("3. Using wild card : ");
//        System.out.println(shapeService.getTriangle().getName());

//        System.out.println("4. Using Pointcut : ");
//        System.out.println(shapeService.getTriangle().getName());

//        System.out.println("5. 'within' using Pointcut : ");
//        System.out.println(shapeService.getCircle().getName());
//
//        System.out.println("6. JoinPoints and Advice Arguments :");
//        System.out.println(shapeService.getCircle().getName());
//
//        System.out.println("7. args:");
//        shapeService.getCircle().setName("dummy name");

        System.out.println("8. Custom annotations : ");
        shapeService.getCircle().setName("Magic");
    }
}
