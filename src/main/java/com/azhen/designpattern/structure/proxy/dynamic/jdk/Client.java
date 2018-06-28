package com.azhen.designpattern.structure.proxy.dynamic.jdk;

import com.azhen.designpattern.structure.proxy.dynamic.cglib.FinalUserDao;
import com.azhen.designpattern.structure.proxy.static1.IUserDao;
import com.azhen.designpattern.structure.proxy.static1.UserDao;

public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
        proxy.saveFinal();
    }
}
