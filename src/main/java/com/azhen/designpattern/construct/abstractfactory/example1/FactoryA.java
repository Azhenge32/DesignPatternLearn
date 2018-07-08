package com.azhen.designpattern.construct.abstractfactory.example1;

public class FactoryA implements Factory {
    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainProductA();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}
