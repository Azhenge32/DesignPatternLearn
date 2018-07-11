package com.azhen.designpattern.behavior.visitor.example3;

public class HoursPayReport extends EmployeeVisitor implements HourselyEmployeeVisitor{
    @Override
    public String visit(HourlyEmployee employee) {

        return employee.getHourPay() + "100 Hours and $1000 in total.";
    }
}
