package com.hitachi;

public class TestNotificationSender {
    private EmailNotificationSender email;
    private SmsNotificationSender sms;
    private WhatsAppNotificationSender whatsapp;

    public TestNotificationSender() {

    }

    public TestNotificationSender(EmailNotificationSender email,
                                  SmsNotificationSender sms,
                                  WhatsAppNotificationSender whatsapp) {
        this.email = email;
        this.sms = sms;
        this.whatsapp = whatsapp;
    }

    public EmailNotificationSender getEmail() {
        return email;
    }

    public void setEmail(EmailNotificationSender email) {
        this.email = email;
    }

    public SmsNotificationSender getSms() {
        return sms;
    }

    public void setSms(SmsNotificationSender sms) {
        this.sms = sms;
    }

    public WhatsAppNotificationSender getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(WhatsAppNotificationSender whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void run() {
        email.notification();
        sms.notification();
        whatsapp.notification();
    }
}
