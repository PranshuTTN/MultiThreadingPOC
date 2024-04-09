package com.thread.MultiThreadingPOC;

public class Consumer extends Thread{

    Company company;
    Consumer(Company c){
        this.company = c;
    }
    public void run(){
        while (true){
            try {
                this.company.consume_item();
            } catch (InterruptedException e) {
                System.out.println("Got exception: " + e);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Got exception: " + e);
            }
        }
    }
}
