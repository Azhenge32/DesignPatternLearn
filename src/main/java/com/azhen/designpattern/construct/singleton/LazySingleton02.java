package com.azhen.designpattern.construct.singleton;

/**
 * 不推荐
 */
public class LazySingleton02 {
    private static LazySingleton02 instance;
    private LazySingleton02() {}
    public synchronized static LazySingleton02 getInstance() {
        if (instance == null) {// 双重检测机制
            instance = new LazySingleton02();
        }
        return instance;
    }
}
