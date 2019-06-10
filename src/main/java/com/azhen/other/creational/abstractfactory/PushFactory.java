package com.azhen.other.creational.abstractfactory;

public interface PushFactory {
    AndroidPush getAndroidPush();
    IOSPush getIOSPush();
    WebPush getWebPush();
    default HuaweiPush getHuaweiPush() {
        throw new RuntimeException("Please Implements HuaweiPush");
    }
}
