package com.azhen.designpattern.construct.abstractfactory.example1;

/**
 * 抽象工厂
 */
public interface Factory {
    AbstractProduct ManufactureContainer();
    AbstractProduct ManufactureMould();
}
