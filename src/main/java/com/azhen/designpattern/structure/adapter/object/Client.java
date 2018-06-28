package com.azhen.designpattern.structure.adapter.object;

import com.azhen.designpattern.structure.adapter.class1.Ps3;
import com.azhen.designpattern.structure.adapter.class1.Usbr;

public class Client {
    public static void main(String[] args) {
        Ps3 p = new Adapter(new Usbr());
        p.isPs3();
    }
}
