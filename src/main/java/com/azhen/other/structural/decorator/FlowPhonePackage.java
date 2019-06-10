package com.azhen.other.structural.decorator;

public class FlowPhonePackage extends AbstractMobilePackageDecorator {
    public FlowPhonePackage(AbstractMobilePackage mobilePackage) {
        super(mobilePackage);
    }

    @Override
    public void doSomething() {

    }

    @Override
    protected int flow() {
        return super.flow() + 1024 * 5;
    }

    @Override
    protected double price() {
        return super.price() + 30;
    }
}
