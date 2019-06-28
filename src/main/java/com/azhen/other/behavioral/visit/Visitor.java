package com.azhen.other.behavioral.visit;

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse course) {
        System.out.println("课程名: " + course.getName());
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println("课程名: " + course.getName() + " 课程价格: " + course.getPrice());
    }
}
