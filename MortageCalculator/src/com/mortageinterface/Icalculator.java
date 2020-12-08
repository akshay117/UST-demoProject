package com.mortageinterface;

public interface Icalculator {
     void MortageCalculator(int principal, float annualInterest, byte years);
     double calculateBalance( short numberOfPaymentsMade );
     double calculateMortgate();
     double[] getRemainingBalance();
     int getNumberOfPayments();
     float getMonthlyInterest();



}
