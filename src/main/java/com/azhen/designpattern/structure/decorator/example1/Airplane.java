package com.azhen.designpattern.structure.decorator.example1;

public class Airplane extends Changer {
    @Override
    public void move() {
        fly();
        super.move();
    }

    private final void fly() {
        System.out.println("飞机");
    }
}
