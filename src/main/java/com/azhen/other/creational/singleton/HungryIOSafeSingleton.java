package com.azhen.other.creational.singleton;

import java.io.Serializable;

public class HungryIOSafeSingleton implements Serializable {
    // private static final HungrySingleton instance = new HungrySingleton();
    private static final HungryIOSafeSingleton instance;
    static {
        instance = new HungryIOSafeSingleton();
    }

    private HungryIOSafeSingleton() {}
    public static HungryIOSafeSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
