package com.azhen.refactoring.P8_data.ReplaceTypeCodewithSubclasses;

public class Engineer extends EmployeeTwo {
    @Override
    int getType() {
        return EmployeeTwo.ENGINEER;
    }
}
