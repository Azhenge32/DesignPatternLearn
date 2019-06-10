package com.azhen.other.structural.decorator;

public class PhonePackage extends AbstractMobilePackage {
    @Override
    protected String desc() {
        return "传统套餐";
    }

    @Override
    protected int voice() {
        return 100;
    }

    @Override
    protected int sms() {
        return 50;
    }

    @Override
    protected int flow() {
        return 30;
    }

    @Override
    protected double price() {
        return 11;
    }
}
