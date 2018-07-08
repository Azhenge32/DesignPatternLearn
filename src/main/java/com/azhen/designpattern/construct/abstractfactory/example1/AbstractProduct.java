package com.azhen.designpattern.construct.abstractfactory.example1;

/**
 * 抽象产品族类
 */
public interface AbstractProduct {
    void show();
    default void play() {
        throw new RuntimeException("请实现该产品");
    }
}
