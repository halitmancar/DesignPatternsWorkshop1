package com.company.behavioral.command;

public class SendEMailCommand implements OrderCommand{
    private Message message;

    public SendEMailCommand(Message message) {
        this.message = message;
    }

    @Override
    public void execute() {
        this.message.sendEmail();
    }
}
