package com.Interface;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args ){
        //Linked List
        //addfirst
        //addlast
        //removeFirst
        //removelast
        //getfirst
        //getlast
        LinkedList<String> tools = new LinkedList<String>();
        tools.add("SPRING");
        tools.add("JAVA");
        tools.add("MONGODB");
        tools.add("MILTS");

        tools.addFirst("Api");
        tools.addLast("PMB");
        tools.removeFirst();

        System.out.println(tools);





    }
}
