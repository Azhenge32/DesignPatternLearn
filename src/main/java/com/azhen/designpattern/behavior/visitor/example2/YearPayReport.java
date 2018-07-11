package com.azhen.designpattern.behavior.visitor.example2;

public class YearPayReport extends EmployeeVisitor {
    @Override
    public String visit(HourlyEmployee employee) {

        return employee.getHourPay() + "100 Hours and $1000 in total.";
    }

    @Override
    public String visit(MonthEmployee employee) {
        return employee.getMonthPay() + "report";
    }
}
