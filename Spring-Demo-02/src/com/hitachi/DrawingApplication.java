package com.hitachi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        System.out.println("1. Annotations Introduction : ");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = context.getBean("triangle", Triangle.class);
        triangle.draw();
    }
}
