package com.azhen.refactoring.P8_data.ReplaceTypeCodewithSubclasses;

public class Salesman extends EmployeeTwo {
    @Override
    int getType() {
        return EmployeeTwo.SALESMAN;
    }
}
