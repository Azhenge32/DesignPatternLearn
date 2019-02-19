package com.azhen.refactoring.P8_data.ChangeValueToReference.two;

import java.util.Collection;

public class Order {
    private Customer customer;
    public Order(String customer) { this.customer = Customer.create(customer); }

    public String getCustomer() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        Customer.create(customer);
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
