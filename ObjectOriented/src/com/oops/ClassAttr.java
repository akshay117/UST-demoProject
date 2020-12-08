package com.oops;

public class ClassAttr {
    int x;
    int year;
    String modelName;

    public ClassAttr(String modelName,int year){
        this.modelName = modelName;
        this.year = year;
    }
    public static void main(String[] args){
        ClassAttr classAttr = new ClassAttr("Iphone",2020);
        System.out.println(classAttr.year + "  "+classAttr.modelName);
    }

}
