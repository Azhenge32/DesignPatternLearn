package com.azhen.refactoring.P8_data.ReplaceTypeCodewithSubclasses;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        this.type = type;
    }

    int getType() {
        return type;
    }
}
