package com.azhen.designpattern.construct.factorymethod.multimethod;

public class FactoryB extends Factory{
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
