package com.azhen.designpattern.construct.simplefactory;

public class Mul implements Operation {

    // 乘法计算
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
