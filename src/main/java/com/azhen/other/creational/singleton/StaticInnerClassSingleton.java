package com.azhen.other.creational.singleton;

public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.instance != null) {
            throw new RuntimeException("Illegal Access");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
