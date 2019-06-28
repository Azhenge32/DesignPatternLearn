package com.azhen.other.behavioral.command;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "吃猫粮");
    }

    public void sit() {
        System.out.println(name + "请坐下");
    }
}
