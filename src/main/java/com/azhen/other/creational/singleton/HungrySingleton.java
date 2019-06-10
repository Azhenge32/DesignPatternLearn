package com.azhen.other.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    // private static final HungrySingleton instance = new HungrySingleton();
    private static final HungrySingleton instance;
    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("Illegal Access");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
