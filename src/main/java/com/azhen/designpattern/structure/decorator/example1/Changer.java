package com.azhen.designpattern.structure.decorator.example1;

public class Changer implements Transform {
    private Transform transform;

    @Override
    public void move() {
        transform.move();
    }
}
