package com.company.behavioral.command;

public class Message {
    public String message;

    public void sendSMS(){
        System.out.println("SMS sent.");
    }
    public void sendEmail(){
        System.out.println("EMail sent.");
    }
    public void makeCall(){
        System.out.println("Call made.");
    }
}
