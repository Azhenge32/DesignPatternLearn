package com.azhen.refactoring.P8_data.ReplaceTypeCodewithSubclasses;

public class Manager extends EmployeeTwo {
    @Override
    int getType() {
        return EmployeeTwo.MANAGER;
    }
}
