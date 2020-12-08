package com.company;

import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;

public class MortgateCalcOne {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal Amount : ");
        int principalAmount = scanner.nextInt();

        System.out.println("Annual Interest Rate :");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (YEARS) :");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double morgate = principalAmount
               * (monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments))
                / ( Math.pow(1+monthlyInterestRate,numberOfPayments) -1 );
        System.out.println(morgate);


        String mortgateFormatted = NumberFormat.getCurrencyInstance().format(morgate);
        System.out.println(mortgateFormatted);


    }
}
