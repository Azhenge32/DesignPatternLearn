package com.azhen.designpattern.construct.abstractfactory.example;

public class MouldProductA implements MouldProduct {
    @Override
    public void show() {
        System.out.println("生产出了模具产品A");
    }
}
