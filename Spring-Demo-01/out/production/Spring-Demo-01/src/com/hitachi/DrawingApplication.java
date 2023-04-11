package com.hitachi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        //1. Tight coupling
        //Triangle triangle = new Triangle();

        // 2.
        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
        // Triangle triangle = (Triangle) factory.getBean("triangle");

        // 3.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // 1. Property injection:
        System.out.println("1. Property injection: ");

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        Circle circle = (Circle) context.getBean("circle");
        circle.area();

        //2. Constructor injection
        System.out.println("\n2. Constructor injection: ");

        Triangle_02 obj = (Triangle_02) context.getBean("triangle_02");
        obj.draw();
        obj.getDetails();

        //3. Object injection
        System.out.println("\n3. Object injection: ");
        // Triangle_03 tri3 = (Triangle_03) context.getBean("triangle_03");
        // tri3.draw();

        //4. Object injection using constructor
        System.out.println("\n4. Object injection using constructor: ");
        Triangle_03 tri = (Triangle_03) context.getBean("triangle_03_02");
        tri.draw();

        //5. Inner beans
        System.out.println("\n5. Inner bean: ");
        // Triangle_03 innerBean = (Triangle_03) context.getBean("triangle_03_03");
        // innerBean.draw();

        //6. Name alias
        System.out.println("\n6. Name alias: ");
        Triangle triangle1 = (Triangle) context.getBean("triangle-alias");
        triangle1.draw();

        //7. List initialization:
        System.out.println("\n7. List initialization: ");
        Triangle_04 list = (Triangle_04) context.getBean("triangle_04");
        list.draw();

        //8. Auto wiring :
        // byName : Name of member variable must be same as id of bean
        // byType : only one member variable and one bean of same type, because it then search for class name
        // constructor : must have same no. of beans as that of parameters of constructor

        System.out.println("\n8. Auto wiring : ");
        System.out.println("\n By name : ");
        Triangle_05_Autowire obj2 = (Triangle_05_Autowire) context.getBean("triangle_05_Autowire");
        obj2.draw();

        //9. Application context aware :
        System.out.println("\n9. Application context aware :");
        Circle_02 radius = (Circle_02) context.getBean("circle_02");
        radius.getBeanName();
        radius.draw();

        //10. Bean definition inheritance
        System.out.println("\n10. Bean definition inheritance : ");


    }
}
