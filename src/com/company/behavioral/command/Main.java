package com.company.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.message = "Merhaba!";

        SendSMSCommand sendSMSCommand = new SendSMSCommand(message);
        SendEMailCommand sendEMailCommand = new SendEMailCommand(message);
        MakeCallCommand makeCallCommand = new MakeCallCommand(message);

        Communicator communicator = new Communicator();
        communicator.addCommand(sendSMSCommand);
        communicator.addCommand(sendEMailCommand);
        communicator.addCommand(makeCallCommand);
        communicator.executeAll();
    }
}
