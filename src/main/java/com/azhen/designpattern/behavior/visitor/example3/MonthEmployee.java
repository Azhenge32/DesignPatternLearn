package com.azhen.designpattern.behavior.visitor.example3;

public class MonthEmployee extends Employee {
    private int monthPay;
    @Override
    public String accept(EmployeeVisitor visitor) {

        try {
            MonthEmployeeVisitor monthEmployeeVisitor = (MonthEmployeeVisitor) visitor;
            return monthEmployeeVisitor.visit(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(int monthPay) {
        this.monthPay = monthPay;
    }
}
