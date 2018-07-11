package com.azhen.designpattern.behavior.visitor.example2;

public abstract class EmployeeVisitor {
    public abstract String visit(HourlyEmployee employee);
    public abstract String visit(MonthEmployee employee);
}
