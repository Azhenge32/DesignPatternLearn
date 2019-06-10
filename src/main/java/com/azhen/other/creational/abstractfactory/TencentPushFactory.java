package com.azhen.other.creational.abstractfactory;

public class TencentPushFactory implements PushFactory {
    @Override
    public AndroidPush getAndroidPush() {
        return null;
    }

    @Override
    public IOSPush getIOSPush() {
        return null;
    }

    @Override
    public WebPush getWebPush() {
        return null;
    }
}
