package com.oops;

public class Employee {
    public int baseSalary;
    public int hourlyWage;
   // public int extraHours;


    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int calculateWage(
            int extraHours
    ){
        return baseSalary+(hourlyWage*extraHours);
    }
public void setBaseSalary(int baseSalary){
        if (baseSalary<=0){
            throw new IllegalArgumentException("Sallary cannot be 0 or less");
        }
        this.baseSalary=baseSalary;
}
    public int getBaseSalary() {
        return baseSalary;
    }
}
