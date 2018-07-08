package com.azhen.designpattern.construct.abstractfactory.example1;

public class ContainProductB implements ContainerProduct {
    @Override
    public void show() {
        System.out.println("生产出了容器产品B");
    }
}
