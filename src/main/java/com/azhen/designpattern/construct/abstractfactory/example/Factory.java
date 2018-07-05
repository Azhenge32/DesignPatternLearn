package com.azhen.designpattern.construct.abstractfactory.example;

import com.azhen.designpattern.construct.builder.example2.Product;

/**
 * 抽象工厂
 */
public interface Factory {
    AbstractProduct ManufactureContainer();
    AbstractProduct ManufactureMould();
}
