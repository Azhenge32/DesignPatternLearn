package com.azhen.designpattern.construct.factorymethod.multimethod;

public class FactoryA extends Factory{
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
