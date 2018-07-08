package com.azhen.designpattern.construct.abstractfactory.example1;

public class Client {
    public static void main(String[] args) {
        FactoryA mFactoryA = new FactoryA();
        FactoryB mFactoryB = new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.ManufactureContainer().show();
        //A厂当地客户需要模具产品A
        mFactoryA.ManufactureMould().show();

        //B厂当地客户需要容器产品B
        mFactoryB.ManufactureContainer().show();
        //B厂当地客户需要模具产品B
        mFactoryB.ManufactureMould().show();
    }
}
