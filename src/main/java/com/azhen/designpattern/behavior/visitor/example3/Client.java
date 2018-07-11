package com.azhen.designpattern.behavior.visitor.example3;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new HourlyEmployee());
        objectStructure.add(new MonthEmployee());
        objectStructure.accept(new HoursPayReport());
        objectStructure.accept(new MonthPayReport());

    }
}
