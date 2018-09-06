package com.azhen.refactoring.P8_data.ReplaceTypeCodewithSubclasses;

public abstract class EmployeeTwo {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeTwo create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    abstract int getType();
}
