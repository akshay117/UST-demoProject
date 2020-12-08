package com.threads;

import java.util.ArrayList;

public class MainLambda1 extends Thread {
    public static int number = 0;

    public static void main(String[] args) {
        // parameter -> expression
        // (parameter1, parameter2) -> expression
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(18);
        numbers.add(27);
        numbers.add(36);
        numbers.add(45);
        numbers.forEach( (n) -> {
            System.out.println(n);
        });
    }
}
