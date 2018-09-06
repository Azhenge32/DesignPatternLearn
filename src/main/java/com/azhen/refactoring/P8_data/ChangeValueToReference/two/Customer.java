package com.azhen.refactoring.P8_data.ChangeValueToReference.two;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    private String name;
    private static Dictionary<String, Customer> instances = new Hashtable();
    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }
    private void store() {
        instances.put(this.getName(), this);
    }
    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Customer getNamed(String name) {
        return instances.get(name);
    }
}
