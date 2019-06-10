package com.azhen.other.structural.decorator;

public abstract class AbstractMobilePackageDecorator extends AbstractMobilePackage {
    private AbstractMobilePackage mobilePackage;

    public AbstractMobilePackageDecorator(AbstractMobilePackage mobilePackage) {
        this.mobilePackage = mobilePackage;
    }

    public abstract void doSomething();

    @Override
    protected int voice() {
        return mobilePackage.voice();
    }

    @Override
    protected int sms() {
        return mobilePackage.sms();
    }

    @Override
    protected int flow() {
        return mobilePackage.flow();
    }

    @Override
    protected double price() {
        return mobilePackage.price();
    }

    @Override
    protected String desc() {
        return mobilePackage.desc();
    }
}
