package com.azhen.designpattern.construct.simplefactory;

public class Add implements Operation {

    // 加法计算
    @Override
    public double getResult(double numberA, double numberB) {

        return numberA + numberB;
    }
}
