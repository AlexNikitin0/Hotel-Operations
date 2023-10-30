package com.pluralsight;

public class Employee {
    //fields
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //getters

    public double getTotalPay(){
        double totalPay = hoursWorked * payRate;
        return totalPay;
    }

    public double getOvertimeHours(){
        double overtimeHours = hoursWorked - 40;
        return overtimeHours;
    }
    public double getRegularHours(){
        return hoursWorked;
    }
}
