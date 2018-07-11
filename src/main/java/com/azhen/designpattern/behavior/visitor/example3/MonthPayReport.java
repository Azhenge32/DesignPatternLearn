package com.azhen.designpattern.behavior.visitor.example3;

public class MonthPayReport extends EmployeeVisitor implements MonthEmployeeVisitor {
    @Override
    public String visit(MonthEmployee employee) {
        return "something";
    }
}
