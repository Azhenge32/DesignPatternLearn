package com.azhen.designpattern.behavior.visitor.example2;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new HourlyEmployee());
        objectStructure.add(new MonthEmployee());
        objectStructure.accept(new HoursPayReport());

        // 定义了一个针对集合中元素的新操作
        objectStructure.accept(new YearPayReport());
    }
}
