package com.azhen.designpattern.behavior.strategy.simplefactory;

public class Mul implements Operation{

    // 乘法计算
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
