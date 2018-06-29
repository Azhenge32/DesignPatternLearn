package com.azhen.designpattern.structure.responsibility_chain.nextHandler;

public class Client {
    public static void main(String[] args) {
        LeaveNote leaveNote = new LeaveNote("小米","肚子疼",8);
        DirectorHandler directorHandler = new DirectorHandler();
        ViceManagerHandler viceManagerHandler = new ViceManagerHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        //也可以通过容器来管理职责对象，不使用setNextHandler
        directorHandler.setNextHandler(viceManagerHandler);
        viceManagerHandler.setNextHandler(managerHandler);
        directorHandler.handLeave(leaveNote);
    }
}
