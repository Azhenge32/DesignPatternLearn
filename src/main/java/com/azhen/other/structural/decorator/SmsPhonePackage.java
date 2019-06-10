package com.azhen.other.structural.decorator;

public class SmsPhonePackage extends AbstractMobilePackageDecorator {
    public SmsPhonePackage(AbstractMobilePackage mobilePackage) {
        super(mobilePackage);
    }

    @Override
    public void doSomething() {

    }

    @Override
    protected int sms() {
        return super.sms() + 100;
    }

    @Override
    protected double price() {
        return super.price() + 1;
    }
}
