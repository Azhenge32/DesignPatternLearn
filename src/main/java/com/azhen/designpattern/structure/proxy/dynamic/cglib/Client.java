package com.azhen.designpattern.structure.proxy.dynamic.cglib;

public class Client {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        FinalUserDao finalUserDao = new FinalUserDao();

        UserDao userDaoProxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();
        userDaoProxy.saveNoFinal();
        userDaoProxy.saveFinal();

        FinalUserDao finalUserDaoProxy = (FinalUserDao) new ProxyFactory(finalUserDao).getProxyInstance();
        finalUserDaoProxy.saveNoFinal();
        finalUserDaoProxy.saveFinal();
    }
}
