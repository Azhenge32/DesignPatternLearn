package com.azhen.designpattern.construct.abstractfactory.example1;

public class MouldProductB implements MouldProduct {
    @Override
    public void show() {
        System.out.println("生产出了模具产品B");
    }
}
