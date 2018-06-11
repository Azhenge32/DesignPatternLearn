package com.azhen.designpattern.construct.singleton;

/**
 * 静态内部类持有示例-饿汉式3
 *
 * 优点：线程安全(类加载器加载)
 * 缺点：序列和反序列化之后不是单例
 */
public class LazySingleton3 {
    private static boolean initialized = false;
    private LazySingleton3() {
        synchronized (LazySingleton3.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例已被破坏");
            }
        }
    }
    static class SingletonHolder {
        private static final LazySingleton3 instance = new LazySingleton3();
    }
    public static LazySingleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
