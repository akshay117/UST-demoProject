package com.mortgage;

public class Car extends Main{
     public void method() {
        System.out.println("Horse Power is High / Method 2 / From Child");
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.method();

    }
}
