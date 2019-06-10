package com.azhen.other.structural.decorator;

public class VoicePhonePackage extends AbstractMobilePackageDecorator {
    public VoicePhonePackage(AbstractMobilePackage mobilePackage) {
        super(mobilePackage);
    }

    @Override
    public void doSomething() {

    }

    @Override
    protected int voice() {
        return super.voice() + 100;
    }

    @Override
    protected double price() {
        return super.price() + 5;
    }
}
