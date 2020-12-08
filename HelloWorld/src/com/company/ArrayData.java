package com.company;

import java.util.Arrays;

public class ArrayData {
    public static void main(String[] args){

        int [][] number = {{1,2,3},{4,5,6}};
        int[] numbers = {2,3,4,5,6,7,8,9,0};
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(number));

        String[] tools = {"java","spring","api"};
        tools[2]= "kafka";
        System.out.println(tools[2]);
        System.out.println(Arrays.deepToString(tools));



    }
}
