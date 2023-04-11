package com.hitachi.usingProperties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Heart {

    /**
     * @Value -> helps to reduce the need of setter method . . .
     * but you can't use @Required on fields if we use @Value . . .
     */
    @Value("${heart.rate}")
    private int rate;

    @Value("${heart.health}")
    private String health;

    @Value("${heart.disease}")
    private String disease;

    public void pump() {
        System.out.println("Heart is pumping");
        System.out.println("You are alive !");

        System.out.println("Details : ");
        System.out.println("Heart rate : " + rate);
        System.out.println("Heart health : " + health);
        System.out.println("Heart disease : " + disease);
    }
}
