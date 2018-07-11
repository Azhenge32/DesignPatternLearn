package com.azhen.designpattern.behavior.visitor.example2;

public class MonthEmployee extends Employee {
    private int monthPay;
    @Override
    public String accept(EmployeeVisitor visitor) {
        return visitor.visit(this);
    }

    public int getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(int monthPay) {
        this.monthPay = monthPay;
    }
}
