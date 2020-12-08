package com.mortageinterface;

public class Main {



    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 10_00_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
        //Interfacing  Icalculator
        Icalculator calculator = new MortageCalculator(principal, annualInterest, years);


        IReports report = new Report();

        //Interfacing Reports

        report.Report((MortageCalculator) calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
