package com.azhen.principle.openclose;

public class MyWork extends Work965{

    public MyWork(String name, int workingHours) {
        super(name, workingHours);
    }

    public Double getOvertime() {
        return super.getWorkingHours() * 0.2;
    }
}
