package com.thread.MultiThreadingPOC;

public class SecondThread extends Thread{
    public void run(){
        for (int i=10;i>=0;i--){
            System.out.println("Value of i: " + i + " in thread 2.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got Exception in thread 2: " + e);
            }
        }
    }
}
