package com.azhen.designpattern.behavior.memento.example2;

import java.util.ArrayList;
import java.util.List;
//Caretaker（负责人）
public class RobotPositionCaretaker {
    private List<RobotPositionMemento> mementoList = new ArrayList<>();

    public RobotPositionMemento getMemento(int setp) {
        return mementoList.get(setp);
    }

    public void setMemento(RobotPositionMemento memento) {
        this.mementoList.add(memento);
    }
}
