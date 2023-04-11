package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringBeanWithDependecy;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META_INF/beans.xml");
        BeanFactory factory = context;

        MySpringBeanWithDependecy test = (MySpringBeanWithDependecy) factory.getBean("mySpringBeanWithDependecy");
        test.run();
    }
}
