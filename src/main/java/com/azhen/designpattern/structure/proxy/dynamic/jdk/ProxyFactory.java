package com.azhen.designpattern.structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成代理对象
    public  Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("---事务开始---");
                        Object rtn = method.invoke(target, args);
                        System.out.println("---提交事务---");
                        return rtn;
                    }
                }
        );
    }
}
