package com.hitachi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserData {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("spring.xml");

        Admin user = (Admin) context.getBean("credentials");
        user.getCredentials();
    }
}

/** Output :
 * User credentials are :
 * Username : shreyash.hk
 * Password : Don'tKnow@123
 *
 * Process finished with exit code 0
 */