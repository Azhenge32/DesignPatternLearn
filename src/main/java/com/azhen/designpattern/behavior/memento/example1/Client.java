package com.azhen.designpattern.behavior.memento.example1;

public class Client {
    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker = new Caretaker();
        caretaker.memento = role.saveMemento();

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------恢复----------");
        role.display();
    }
}
