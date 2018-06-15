package com.azhen.designpattern.construct.simplefactory;

public class Div implements Operation {

    // 除法计算
     double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0！");
        }
        return numberA / numberB;
    }
}
