package hitachi;

import hitachi.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

        System.out.println("1.");
        shapeService.getCircle().getName();

    }
}
