package com.azhen.designpattern.behavior.visitor.example2;

public class HourlyEmployee extends Employee {
    private int hourPay;
    @Override
    public String accept(EmployeeVisitor visitor) {
        return visitor.visit(this);
    }

    public int getHourPay() {
        return hourPay;
    }

    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }
}
