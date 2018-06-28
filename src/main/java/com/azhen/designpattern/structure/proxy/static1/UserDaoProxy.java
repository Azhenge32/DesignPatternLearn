package com.azhen.designpattern.structure.proxy.static1;

/**
 * 代理对象，静态代理
 */
public final class UserDaoProxy implements IUserDao {
    // 接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("---开始事务---");
        // 执行目标对象方法
        target.save();
        System.out.println("---提交事务---");
    }

    @Override
    public void saveFinal() {
        System.out.println("---开始事务---");
        // 执行目标对象方法
        target.saveFinal();
        System.out.println("---提交事务---");
    }
}
