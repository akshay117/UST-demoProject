package com.Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args){

                                                  //////   ArrayList implements List(interface)   => Collections
        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(90);
        grades.add(60);
        grades.add(80);
        grades.add(70);
        Collections.sort(grades);


        for(int grade : grades){
            System.out.println(grade);
        }


        ArrayList<String> tools = new ArrayList<String>();
        tools.add("SPRING");
        tools.add("JAVA");
        tools.add("MONGODB");
        tools.add("MLTS");
        tools.set(1,"POST MAN");
        System.out.println(tools);

       /*  int toolSize = tools.size();
        for (int i=0; i<tools.size();i++){
            System.out.println(tools.get(i) ); */
        Collections.sort(tools);

        for (String tool :tools){
            System.out.println(tool);
        }

    }

}