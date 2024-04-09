package com.thread.MultiThreadingPOC;

class UserThread extends Thread{
    public void run(){
        System.out.println("This is user thread task running");
    }
}
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program Started->>>>>>>>");
        int number = 23+89;
        System.out.println("Sum calculated: " + number);
        Thread t = new Thread();
        t.setName("SumThread");
        System.out.println("Current running thread is " + t.getName());
        Thread.sleep(3000);
        System.out.println("ID of " + t.getName() + " is " + t.getId());
        System.out.println("Program Ended->>>>>>>>>>");

        UserThread userThread = new UserThread();
        userThread.start();
    }
}
