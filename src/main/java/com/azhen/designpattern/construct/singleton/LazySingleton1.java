package com.azhen.designpattern.construct.singleton;

/**
 * 双重校验锁+volatile-饿汉式
 * 优点：线程安全
 * 缺点：synchronized浪费性能
 *      反射会破坏单例特性
 */
public class LazySingleton1 {
    // 禁止指令重排是，拿到未初始化好的对象
    private volatile static LazySingleton1 instance;
    private LazySingleton1() {}
    public static LazySingleton1 getInstance() {
        if (instance == null) {// 双重检测机制
            synchronized (LazySingleton1.class) {
                if (instance == null) {
                    instance = new LazySingleton1();
                }
            }
        }
        return instance;
    }
}
