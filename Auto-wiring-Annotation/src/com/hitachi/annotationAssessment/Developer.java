package com.hitachi.annotationAssessment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Developer {
    public static void main(String[] args) {

        System.out.println("1. byType Example : ");
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-byType.xml");
        First_Device firstDevice = context.getBean("firstDevice", First_Device.class);
        firstDevice.use();

        System.out.println("\n2. byName Example : ");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("autowiring-byName.xml");
        Second_Device secondDevice = context2.getBean("secondDevice", Second_Device.class);
        secondDevice.use();

    }
}

/** Output :
 * 1. byType Example :
 * Constructor method called !!
 * You have Lenovo Think pad which has 16 RAM, and runs on Intel CORE vPRO
 *
 * 2. byName Example :
 * Setter method called !!
 * You have Lenovo Think pad which has 16 RAM, and runs on Intel CORE vPRO
 */

/** Auto wiring is not possible for primitive datatype, mainly used for objects.
 * 1. byType
 * 2. byName
 *
 * No need to write autowired if we are using Qualifier before dependency . . .*/