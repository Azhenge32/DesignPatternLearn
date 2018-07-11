package com.azhen.designpattern.behavior.memento.example2;

public class Client {
    public static void main(String[] args) {
        RobotPositionCaretaker caretaker = new RobotPositionCaretaker();
        RobotPosition robot = new RobotPosition("Android", 0, 0);
        robot.drawScreen();
        caretaker.setMemento(robot.save());

        robot.setPos(0, 1);
        robot.drawScreen();
        caretaker.setMemento(robot.save());

        robot.setPos(5, 5);
        robot.drawScreen();

        //back to step 1
        robot.restore(caretaker.getMemento(0));
        robot.drawScreen();
        caretaker.setMemento(robot.save());
    }
}
