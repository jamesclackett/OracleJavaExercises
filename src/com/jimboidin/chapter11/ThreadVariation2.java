package com.jimboidin.chapter11;

/*  MyThreadV2 creates a Thread when its constructor is called
    and stores it in an instance variable called thread.
    It also sets the name of the thread and provides a
    factory method to create and start a thread.

    NOTE: A Factory Method is a method that returns an object of a class
    They are usually static. See below.
 */


class MyThreadV2 implements Runnable{
    Thread thread;

    MyThreadV2(String name){
        thread = new Thread(this, name);
    }

    // A factory method that creates and starts a thread
    public static MyThreadV2 createAndStart(String name){
        MyThreadV2 myThreadV2 = new MyThreadV2(name);
        myThreadV2.thread.start(); // start the thread
        return myThreadV2;
    }

    // Entry point of thread
    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}

public class ThreadVariation2 {
    public static void main(String[] args){
        System.out.println("Main thread is starting");

        // Create and start a thread
        MyThreadV2 myThreadV2 = MyThreadV2.createAndStart("Child #1");

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
