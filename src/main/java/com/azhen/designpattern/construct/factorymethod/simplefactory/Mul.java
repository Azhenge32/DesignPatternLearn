package com.azhen.designpattern.construct.factorymethod.simplefactory;

public class Mul implements Operation {

    // 乘法计算
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
