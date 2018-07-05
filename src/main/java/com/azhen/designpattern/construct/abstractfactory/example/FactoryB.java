package com.azhen.designpattern.construct.abstractfactory.example;

public class FactoryB implements Factory {
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainProductB();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}
