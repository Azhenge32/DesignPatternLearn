package com.azhen.designpattern.behavior.visitor.example3;

public class HourlyEmployee extends Employee {
    private int hourPay;
    @Override
    public String accept(EmployeeVisitor visitor) {
        try {
            HourselyEmployeeVisitor hourselyEmployeeVisitor = (HourselyEmployeeVisitor) visitor;
            return hourselyEmployeeVisitor.visit(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getHourPay() {
        return hourPay;
    }

    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }
}
