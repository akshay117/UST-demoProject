package com.threads;

public class MainThreads extends Thread {
    public static int number = 0;

    public static void main(String[] args) {
        MainThreads thread = new MainThreads();
        thread.start();

        //wait for thread to finish
        while (thread.isAlive()){
            System.out.println("live...!");
        }
        System.out.println("Outside: " + number);
        number++;
        System.out.println("Outside: " + number);
        number++;
        System.out.println("Outside: " + number);
    }

    public void run() {
        number++;
        System.out.println(number);
    }
}
