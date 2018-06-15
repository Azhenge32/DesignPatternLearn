package com.azhen.designpattern.construct.factorymethod.simplefactory;

public class Sub implements Operation {

    // 减法计算
    public double getResult(double numberA, double numberB) {
        return numberA-numberB;
    }
}
