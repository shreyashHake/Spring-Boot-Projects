package com.hitachi.service;

import com.hitachi.model.HomePage;
import com.hitachi.model.MainPage;

import java.sql.SQLOutput;

public class AccessService {
    private HomePage homePage;
    private MainPage mainPage;

    public AccessService(){}

    public AccessService(HomePage homePage, MainPage mainPage) {
        this.homePage = homePage;
        this.mainPage = mainPage;
    }

    public HomePage getHomePage() {
        System.out.println("From homePage");
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public MainPage getMainPage() {
        System.out.println("From mainPage");
        return mainPage;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }
}
