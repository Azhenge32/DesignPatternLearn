package com.azhen.other.creational.singleton;

public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {}
    private static volatile LazyDoubleCheckSingleton instance = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    // 步骤2、3会重排序
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置instance指向刚分配的内存地址
                }
            }
        }
        return instance;
    }
}
