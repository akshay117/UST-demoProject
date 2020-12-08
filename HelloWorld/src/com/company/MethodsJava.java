package com.company;

public class MethodsJava {

    public static void main(String[] args){
        greetUser("Akshay V Anil");
        greetUser("Deepkak");
        helloUser("Akhil",67);
        ;
        System.out.println(sum(6));
    }

    static int sum(int x){
        return 5+x;
    }


    public static void greetUser(String name){
        System.out.println("Hello "+ name);
    }

    public static void helloUser(String name,int age){
        System.out.println(name +" is "+ age);
    }
}
