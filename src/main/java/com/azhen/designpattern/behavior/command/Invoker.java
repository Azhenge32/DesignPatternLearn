package com.azhen.designpattern.behavior.command;

public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
