package com.azhen.designpattern.construct.abstractfactory.example2;

public class HpFactory  implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
