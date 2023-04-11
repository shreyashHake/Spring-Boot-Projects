package com.hitachi.usingProperties;

import org.springframework.beans.factory.annotation.Autowired;

public class Body {
    private Heart heart;

    public Body(){}

    public Body(Heart heart) {
        System.out.println("Constructor called");
        this.heart = heart;
    }

    public void pumping() {
        if (heart != null) heart.pump();
        else System.out.println("You are dead !");
    }
}
