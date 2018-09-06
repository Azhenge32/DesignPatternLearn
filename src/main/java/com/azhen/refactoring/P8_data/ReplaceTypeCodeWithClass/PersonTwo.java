package com.azhen.refactoring.P8_data.ReplaceTypeCodeWithClass;

public class PersonTwo {
    private BloodGroup bloodGroup;

    public PersonTwo(BloodGroup arg) {
        this.bloodGroup = arg;
    }
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup arg) {
        bloodGroup = arg;
    }
}
