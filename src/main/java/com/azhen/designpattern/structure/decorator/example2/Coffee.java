package com.azhen.designpattern.structure.decorator.example2;

public class Coffee implements Drink {
    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "coffee";
    }
}
