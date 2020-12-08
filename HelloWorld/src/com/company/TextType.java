package com.company;

public class TextType {
    public static void main(String[] args){
        String message = "     I LOVE \"JAVA\"" + " !!";
        String path = "C:\\Windows\\User";

        System.out.println( message.endsWith(" !!"));
        System.out.println( message.indexOf("J"));
        System.out.println( message.length());
        System.out.println( message.trim());
        System.out.println(path);
    }
}
