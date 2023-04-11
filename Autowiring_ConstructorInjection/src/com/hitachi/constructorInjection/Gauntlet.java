package com.hitachi.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Gauntlet {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("list.xml");
        InfinityStones stones = (InfinityStones) context.getBean("list");
        stones.snap();
    }
}
