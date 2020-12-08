package com.company;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        System.out.println("ENter the Number: " );
        Scanner scanner = new Scanner(System.in);

        int numberToCheck = scanner.nextInt();
       // Prime(numberToCheck);
        Palindrome(numberToCheck);
    }



    static void Prime(int number)  {
        boolean flag =false;

        for(int i=2;i<=number/2;++i){
            if(number%i==0) {
                flag = true;
                break; }}

        if(number==1){
            System.out.println("NEITHER PRIME NOR COMPOSITE");}
        if (!flag){
            System.out.println("prime");}
        else{
            System.out.println("not prime");
        }
    }

    static void Palindrome(int number) {
        int orginalNumber = number;
        int i = 1;
        int reverse=1;
        while (i != 0) {
            int lastDigit = orginalNumber % 10;
            reverse = reverse * 10 + lastDigit;
            orginalNumber = orginalNumber / 10;

        }
        if (orginalNumber == reverse) {
            System.out.println("YES");
        } else {
            System.out.println("no");
        }

    }
}



