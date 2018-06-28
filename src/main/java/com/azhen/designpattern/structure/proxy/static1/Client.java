package com.azhen.designpattern.structure.proxy.static1;

public class Client {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
        proxy.saveFinal();
    }
}
