package com.thread.MultiThreadingPOC;

public class Producer extends Thread{

    Company company;
    Producer(Company c){
        this.company = c;
    }

    public void run(){
        int i = 1;
        while (true){
            try {
                this.company.produce_item(i);
            } catch (InterruptedException e) {
                System.out.println("Got exception: " + e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got exception: " + e);
            }
            i++;
        }
    }
}
