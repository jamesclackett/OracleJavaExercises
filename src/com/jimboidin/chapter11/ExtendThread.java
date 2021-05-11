package com.jimboidin.chapter11;

/*
    Try This 11-1

    Extend Thread instead of creating class that implements Runnable
 */

class MyThreadV3 extends Thread{

    // Construct a new Thread
    MyThreadV3(String name){
        super(name);
    }

    // Entry point of thread
    public void run(){
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " terminated.");
    }
}


public class ExtendThread{
    public static void main(String[] args){
        System.out.println("Main thread starting");

        MyThreadV3 myThreadV3 = new MyThreadV3("Child #1");
        myThreadV3.start();

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    }
}
