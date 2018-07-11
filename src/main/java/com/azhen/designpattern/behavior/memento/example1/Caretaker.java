package com.azhen.designpattern.behavior.memento.example1;

public class Caretaker {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
