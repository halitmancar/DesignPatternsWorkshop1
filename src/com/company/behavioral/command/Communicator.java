package com.company.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Communicator {
    private List<OrderCommand> commands = new ArrayList<>();

    public void addCommand(OrderCommand command){
        commands.add(command);
    }
    public void executeAll(){
        for (OrderCommand c : commands) {
            c.execute();
        }
        commands.clear();
    }
}
