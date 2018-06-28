package com.azhen.designpattern.structure.proxy.static1;

public final class UserDao implements IUserDao {
    @Override
    public final void save() {
        System.out.println("---已经保存数据---");
    }

    @Override
    public final void saveFinal() {
        System.out.println("---已经保存数据 final---");
    }
}
