package com.azhen.designpattern.behavior.visitor.example1;

public class HourlyEmployee extends Employee {
    @Override
    public String getHoursAndPayReport() {
        return "100 Hours and $1000 in total.";
    }
}
