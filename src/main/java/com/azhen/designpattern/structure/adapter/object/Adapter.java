package com.azhen.designpattern.structure.adapter.object;

import com.azhen.designpattern.structure.adapter.class1.Ps3;
import com.azhen.designpattern.structure.adapter.class1.Usb;

public class Adapter implements Ps3 {
    private Usb usb;
    public Adapter(Usb usb) {
        this.usb = usb;
    }
    @Override
    public void isPs3() {
        usb.isUsb();
    }
}
