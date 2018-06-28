package com.azhen.designpattern.structure.adapter.class1;

public class Adapter extends Usbr implements Ps3 {
    @Override
    public void isPs3() {
        isUsb();
    }
}
