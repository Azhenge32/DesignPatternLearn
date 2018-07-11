package com.azhen.designpattern.behavior.visitor.example1;

public class MonthEmployee extends Employee {
    @Override
    public String getHoursAndPayReport() {
        return "150 Hours and $1000 in total.";
    }
}
