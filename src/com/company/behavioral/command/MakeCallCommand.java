package com.company.behavioral.command;

public class MakeCallCommand implements OrderCommand{

    private Message message;

    public MakeCallCommand(Message message) {
        this.message = message;
    }

    @Override
    public void execute() {
        this.message.makeCall();
    }
}
