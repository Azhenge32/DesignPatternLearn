package com.azhen.other.structural.proxy.dynamicproxy;


import com.azhen.other.structural.proxy.IOrderService;
import com.azhen.other.structural.proxy.Order;
import com.azhen.other.structural.proxy.OrderServiceImpl;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
