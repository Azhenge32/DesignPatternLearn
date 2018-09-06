package com.azhen.refactoring.P8_data.ReplaceDataValuewithObject.two;

import java.util.Collection;

public class Order {
    private Customer customer;
    public Order(String customer) {
        this.customer = new Customer(customer);
    }

    public String getCustomer() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        this.customer = new Customer(customer);
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
