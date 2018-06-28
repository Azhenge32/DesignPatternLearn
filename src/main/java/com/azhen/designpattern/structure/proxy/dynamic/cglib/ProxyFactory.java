package com.azhen.designpattern.structure.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
public class ProxyFactory implements MethodInterceptor {
    // 维护目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");
        Object rtn = method.invoke(target, args);
        System.out.println("提交事务...");
        return rtn;
    }

    // 给目标对象创建一个代理对象
    public Object getProxyInstance() {
        // 1.工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类（代理对象）
        return enhancer.create();
    }
}
