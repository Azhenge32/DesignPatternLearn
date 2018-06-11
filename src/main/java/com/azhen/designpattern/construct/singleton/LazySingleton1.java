package com.azhen.designpattern.construct.singleton;

/**
 * 双重校验锁-饿汉式
 * 优点：线程安全啦
 * 缺点：synchronized浪费性能
 *      反射会破坏单例特性
 */
public class LazySingleton1 {
    private static LazySingleton1 instance;
    private LazySingleton1() {}
    public static LazySingleton1 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton1.class) {
                if (instance == null) {
                    instance = new LazySingleton1();
                }
            }
        }
        return instance;
    }
}
