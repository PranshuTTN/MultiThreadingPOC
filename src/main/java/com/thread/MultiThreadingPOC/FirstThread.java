package com.thread.MultiThreadingPOC;

public class FirstThread implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Value of i: " + i + " in thread 1.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Got Exception in thread 1: " + e);
            }
        }
    }

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        Thread t1 = new Thread(firstThread);

        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();
    }
}
// 3 threads are working together 1-> Main thread which created objects and threads
// and 2&3 -> threads which are printing values