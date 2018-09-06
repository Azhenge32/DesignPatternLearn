package com.azhen.refactoring.P8_data.ReplaceDataValuewithObject.one;

import java.util.Collection;

public class Order {
    private String customer;
    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                result ++;
            }
        }
        return result;
    }
}
