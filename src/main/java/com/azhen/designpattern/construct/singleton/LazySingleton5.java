package com.azhen.designpattern.construct.singleton;

/**
 * 枚举实现
 *
 * 原理
 * 1、我们都知道enum是由class实现的，换言之，enum可以实现很多class的内容，包括可以有member和member function，这也是我们可以用enum作为一个类来实现单例的基础。
 * 2、enum有且仅有private的构造器
 * 3、自由序列化，线程安全，保证单例
 */
public enum LazySingleton5 {
    INSTANCE;
    public void otherMethods(){
        System.out.println("Something");
    }
}
