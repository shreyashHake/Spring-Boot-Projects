package com.hitachi;

import com.hitachi.service.AccessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccessService service = context.getBean("accessService", AccessService.class);

        System.out.println(service.getMainPage().getUsername());

    }
}
