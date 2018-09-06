package com.azhen.refactoring.P8_data.ReplaceTypeCodeWithClass;

public class Person {
    public static final int O = 0;
    public static final int A = 1;
    private static final int B = 2;
    private static final int AB = 3;

    private int bloodGroup;
    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
