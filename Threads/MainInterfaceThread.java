package com.threads;

public class MainInterfaceThread implements Runnable {

    public static void main(String[] args) {
        int num = 0;
	// Thread class and Runnable interface
        MainInterfaceThread mainObj = new MainInterfaceThread();
        Thread thread = new Thread(mainObj);
        thread.start();
        System.out.println("Out of thread");
    }

    public void run() {
        System.out.println("Inside Thread");
    }
}
