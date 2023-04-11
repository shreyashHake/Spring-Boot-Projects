package com.hitachi.usingProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("heart_properties.xml");
        Body body = context.getBean("body", Body.class);
        body.pumping();
    }
}
