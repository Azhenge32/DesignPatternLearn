package com.azhen.designpattern.construct.singleton;

/**
 * 饿汉式
 * 优点：线程安全啦
 * 缺点：类加载的时候就实例化对象了浪费空间
 *       反射会破坏单例特性
 */
public class LazySingleton0 {
    private static LazySingleton0 instance = new LazySingleton0();
    private LazySingleton0 (){}
    public static LazySingleton0 getInstance() {
        return instance;
    }
}
