package com.jimboidin.chapter11;

class MyThreadV1 implements Runnable{
    Thread thisThread;

    MyThreadV1(String name){
        thisThread = new Thread(this, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadVariation1 {
    public static void main(String[] args){
        MyThreadV1 myThreadV1 = new MyThreadV1("CHild1");
        myThreadV1.thisThread.start();
    }
}
