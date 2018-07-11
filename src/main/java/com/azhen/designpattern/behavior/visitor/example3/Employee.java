package com.azhen.designpattern.behavior.visitor.example3;

public abstract class Employee {
    public abstract String accept(EmployeeVisitor visitor);
}
