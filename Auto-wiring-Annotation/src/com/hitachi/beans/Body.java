package com.hitachi.beans;

public class Body {
    private Heart heart;

    public Body(Heart heart) {
        System.out.println("Constructor called");
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void pumping() {
        if (heart != null) heart.pump();
        else System.out.println("You are dead !");
    }
}
