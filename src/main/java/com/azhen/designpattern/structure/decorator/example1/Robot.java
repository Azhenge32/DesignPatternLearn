package com.azhen.designpattern.structure.decorator.example1;

public class Robot extends Changer{
    @Override
    public void move() {
        say();
        super.move();
    }

    private final void say() {
        System.out.println("变成机器人");
    }
}
