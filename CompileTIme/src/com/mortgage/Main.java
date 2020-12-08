package com.mortgage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var calculate = new Calculate();
        System.out.println(calculate.add(10,6));
        System.out.println(calculate.add(11,22,33));
    }
}
