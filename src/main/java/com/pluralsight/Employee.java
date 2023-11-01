package com.pluralsight;
import java.time.*;
public class Employee {
    //fields
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalTime currentTime = LocalTime.now();

   private double timeIn;
   private double timeOut;

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

    public void punchIn(double time){
         timeIn = time;
    }
    public void punchIn(LocalTime current){
        currentTime = current;
    }
    public void punchOut(double time){
        timeOut = time;
    }
    public void punchOut(LocalTime current){
        currentTime = current;
    }
}
