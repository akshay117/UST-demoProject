package com.company;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       /*  System.out.println("AGE?");
        byte age = scanner.nextByte();
        System.out.println( "YOU ARE:" + age);
        */

        System.out.println("NAME: ");
        //String name = scanner.next();
        String name = scanner.nextLine().trim();   //trim and takes a whole line as output.
        System.out.println("You are :"+ name);






    }

}
