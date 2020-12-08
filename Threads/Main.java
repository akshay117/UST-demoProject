package com.threads;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Main extends Thread {
    public static int number = 0;

    public static void pirntFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringFunction dollar = (s) -> s + "$";
        pirntFormatted("Hey ", dollar);

//////////////////////////////////////////////////////////
//        // parameter -> expression
//        // (parameter1, parameter2) -> expression
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(9);
//        numbers.add(18);
//        numbers.add(27);
//        numbers.add(36);
//        numbers.add(45);
//
//        Consumer<Integer> method = (n) -> {
//            System.out.println(n);
//        };
//        numbers.forEach(method);
    }
}
