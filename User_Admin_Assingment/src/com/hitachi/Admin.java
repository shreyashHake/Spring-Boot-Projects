package com.hitachi;

public class Admin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getCredentials() {
        System.out.println("User credentials are : ");
        System.out.println("Username : " + getUsername() + "\n" + "Password : " + getPassword());
    }
}
