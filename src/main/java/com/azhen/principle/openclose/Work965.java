package com.azhen.principle.openclose;

public class Work965 implements Work{
    private String name;
    private int workingHours;

    public Work965(String name, int workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

}
