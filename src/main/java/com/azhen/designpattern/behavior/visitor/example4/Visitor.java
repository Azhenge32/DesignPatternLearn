package com.azhen.designpattern.behavior.visitor.example4;

public interface Visitor {
    void visit(Student student);
    void visit(Teacher teacher);
}
