package com.azhen.designpattern.construct.abstractfactory.example;

public class ContainProductA implements ContainerProduct {
    @Override
    public void show() {
        System.out.println("生产出了容器产品A");
    }
}
