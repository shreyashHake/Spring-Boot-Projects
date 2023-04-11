package com.hitachi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle_02 implements ApplicationContextAware, BeanNameAware {
    private Point radius;
    private ApplicationContext context = null;
    private String beanName;

    public Circle_02(Point radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Center of circle : (" + radius.getY() + "," + radius.getY() + ")");
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }

    public void getBeanName() {
        System.out.println("Bean name is: " + beanName );
    }
}
