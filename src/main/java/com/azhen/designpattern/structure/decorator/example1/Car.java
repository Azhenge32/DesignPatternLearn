package com.azhen.designpattern.structure.decorator.example1;

public class Car implements Transform {
    @Override
    public void move() {
        System.out.println("车辆在行驶");
    }
}
