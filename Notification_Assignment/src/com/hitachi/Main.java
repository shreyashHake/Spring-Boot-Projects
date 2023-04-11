package com.hitachi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        addDash();
        System.out.println("\n1. Setter injection : ");

        var context1 = new ClassPathXmlApplicationContext("setterInjection.xml");
        TestNotificationSender obj1 = (TestNotificationSender) context1.getBean("notification-01");
        obj1.run();

        addDash();
        System.out.println("\n2. Constructor injection : ");

        var context2 = new ClassPathXmlApplicationContext("constructorInjection.xml");
        TestNotificationSender obj2 = (TestNotificationSender) context2.getBean("notification-02");
        obj2.run();

        addDash();
    }

    private static void addDash() {
        System.out.println("\n------------------------------------- * * * * * * * * * * * * * * * * ------------------------------------- ");
    }
}

/**Output :
 * ------------------------------------- * * * * * * * * * * * * * * * * -------------------------------------
 *
 * 1. Setter injection :
 *
 *  Email notification: amir@hitachivantara.com received email from samir@hitachivantara.com
 *
 *  Sms notification: Sham received sms from Ram
 *
 *  Whatsapp notification: Ajit received whatsapp message from Shreyash
 *
 * ------------------------------------- * * * * * * * * * * * * * * * * -------------------------------------
 *
 * 2. Constructor injection :
 *
 *  Email notification: ajay@hitachivantara.com received email from shreyash@hitachivantara.com
 *
 *  Sms notification: Amay received sms from Mihir
 *
 *  Whatsapp notification: Satish received whatsapp message from Somana
 *
 * ------------------------------------- * * * * * * * * * * * * * * * * -------------------------------------
 */