package com.azhen.other.structural.decorator;

public class Test {
    public static void main(String[] args) {
        AbstractMobilePackage mobilePackage = new PhonePackage();
        mobilePackage = new FlowPhonePackage(mobilePackage);
        mobilePackage = new SmsPhonePackage(mobilePackage);
        mobilePackage = new VoicePhonePackage(mobilePackage);

        System.out.println("流量:" + mobilePackage.flow() + " 通话:" + mobilePackage.voice()
        + " 短信:" + mobilePackage.sms() + " 售价:" + mobilePackage.price());
    }
}
