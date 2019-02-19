package com.azhen.designpattern.construct.singleton;

/**
   懒汉模式，线程不安全，不推荐使用
 */
public class LazySingleton01 {
    private static LazySingleton01 instance;
    private LazySingleton01() {}
    public static LazySingleton01 getInstance() {
        if (instance == null) {
            instance = new LazySingleton01();
        }
        return instance;
    }
}
