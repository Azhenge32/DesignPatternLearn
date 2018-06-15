package com.azhen.designpattern.construct.builder.example2;

public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}
