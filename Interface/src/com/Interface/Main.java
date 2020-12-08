package com.Interface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tools = new ArrayList<String>();
        tools.add("SPRING");
        tools.add("JAVA");
        tools.add("MONGODB");
        tools.add("MLTS");
        tools.set(1, "POST MAN");

        Iterator<String> ITR = tools.iterator();

        System.out.println(ITR.next());
        System.out.println(ITR.next());
        System.out.println(ITR.next());
        System.out.println(ITR.next());
    }
}