package com.company.behavioral.command;

public class SendSMSCommand implements OrderCommand{
    public Message message;

    public SendSMSCommand(Message message){
        this.message = message;
    }

    @Override
    public void execute() {
        this.message.sendSMS();
    }
}
