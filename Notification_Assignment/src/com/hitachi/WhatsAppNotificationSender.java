package com.hitachi;

public class WhatsAppNotificationSender implements INotificationSender {
    private String sender;
    private String receiver;

    public WhatsAppNotificationSender() {

    }

    public WhatsAppNotificationSender(String sender, String receiver) {
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
        System.out.println("\n Whatsapp notification: " + getReceiver() + " received whatsapp message from " + getSender());
    }
}
