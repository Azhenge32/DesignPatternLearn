package com.azhen.designpattern.behavior.command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommandA(receiver));
        invoker.runCommand();
        invoker.setCommand(new ConcreteCommandB(receiver));
        invoker.runCommand();
    }
}
