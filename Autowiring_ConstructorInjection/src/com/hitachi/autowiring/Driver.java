package com.hitachi.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        System.out.println("1. Auto wiring byName :");

        var context1 = new ClassPathXmlApplicationContext("byName.xml");
        Vehicle_byName car1 = (Vehicle_byName) context1.getBean("vehicle-01");
        car1.drive();

        System.out.println("\n2. Auto wiring byType : ");

        var context2 = new ClassPathXmlApplicationContext("byType.xml");
        Vehicle_byType car2 = (Vehicle_byType) context2.getBean("vehicle-02");
        car2.drive();

        System.out.println("\n3. Auto wiring default (i.e. no auto wiring) : ");

        var context3 = new ClassPathXmlApplicationContext("default.xml");
        Vehicle_default car3 = (Vehicle_default) context3.getBean("vehicle-03");
        car3.drive();
    }
}

/**Output :
 * 1. Auto wiring byName :
 * Driving Lambo, which has Red color and 789 horse power.
 * Driving Bugati, which has Gold color and 679 horse power.
 * Driving Rolls, which has Silver color and 987 horse power.
 *
 * 2. Auto wiring byType :
 * Driving Lambo, which has Blue color and 893 horse power.
 *
 * 3. Auto wiring default (i.e. no auto wiring) :
 * Driving car from default
 */
