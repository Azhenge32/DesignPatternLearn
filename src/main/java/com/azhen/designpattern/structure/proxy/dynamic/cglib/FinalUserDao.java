package com.azhen.designpattern.structure.proxy.dynamic.cglib;

public final class FinalUserDao {
    public void saveNoFinal() {
        System.out.println("---已经保存数据---");
    }

    public final void saveFinal() {
        System.out.println("---已经保存数据---");
    }
}
