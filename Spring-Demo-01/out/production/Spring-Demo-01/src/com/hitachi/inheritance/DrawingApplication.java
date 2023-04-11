package com.hitachi.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Triangle triangle = context.getBean("triangle1", Triangle.class);
        triangle.draw();
    }
}
