package com.hitachi;

public class EmailNotificationSender implements INotificationSender {

    private String sender;
    private String receiver;

    public EmailNotificationSender() {

    }

    public EmailNotificationSender(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void notification() {
        System.out.println("\n Email notification: " + getReceiver() + " received email from " + getSender());
    }
}
