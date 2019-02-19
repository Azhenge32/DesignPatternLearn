package com.azhen.designpattern.construct.singleton;

/**
 * 饿汉式
 * 优点：线程安全啦
 * 缺点：类加载的时候就实例化对象了浪费空间
 *       反射会破坏单例特性
 * 场景：私有构造方法中没有过多的处理，避免加载慢导致的性能问题
 *       创建的对象会一定会被使用，避免资源浪费
 */
public class LazySingleton0 {
    private LazySingleton0 (){}
    private static LazySingleton0 instance = new LazySingleton0();
    public static LazySingleton0 getInstance() {
        return instance;
    }
}
