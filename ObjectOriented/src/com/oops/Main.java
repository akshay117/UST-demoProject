package com.oops;

public class Main {

    public static void main(String[] args) {
        var employee =  new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyWage= 200;
        int wage = employee.calculateWage(5);
        System.out.println(wage);
    }}
