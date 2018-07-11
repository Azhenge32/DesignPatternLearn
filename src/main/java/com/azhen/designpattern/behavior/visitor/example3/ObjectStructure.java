package com.azhen.designpattern.behavior.visitor.example3;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Employee> employees = new ArrayList<>();
    public void add(Employee employee) {
        employees.add(employee);
    }

    public void accept(EmployeeVisitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
