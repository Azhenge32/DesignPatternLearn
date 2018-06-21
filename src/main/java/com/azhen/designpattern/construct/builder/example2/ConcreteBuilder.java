package com.azhen.designpattern.construct.builder.example2;

public class ConcreteBuilder implements Builder {
    Part partA, partB, partC;

    @Override
    public void buildPartA() {
        //这里是具体如何构建partA的代码
    };

    @Override
    public void buildPartB() {
    };

    @Override
    public void buildPartC() {
        //这里是具体如何构建partB的代码
    };

    @Override
    public Product getResult() {
        //返回最后组装成品结果
        return null;
    };
}
