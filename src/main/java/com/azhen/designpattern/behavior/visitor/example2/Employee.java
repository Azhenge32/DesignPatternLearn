package com.azhen.designpattern.behavior.visitor.example2;

public abstract class Employee {
    public abstract String accept(EmployeeVisitor visitor);
}
