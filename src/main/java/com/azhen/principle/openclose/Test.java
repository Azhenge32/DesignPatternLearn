package com.azhen.principle.openclose;

public class Test {
    public static void main(String[] args) {
        Work work = new MyWork("Java工程师",10);
        MyWork myWork = (MyWork) work;
        System.out.println("工作: " + work.name() + "工作时长: " + myWork.getWorkingHours() + "加班时长: " + myWork.getOvertime());
    }
}
