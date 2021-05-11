package com.jimboidin.test;

class MyRunnable implements Runnable{
    public int testInt = 9;
    public String testString = "hi";

    @Override
    public void run() {
        System.out.println("I am an implementation");
    }

    public void notAnImplementation(){
        System.out.println("I am nothing to do with the Runnable Interface");
    }
}

public class Test {
    public static void main(String[] args){
       MyRunnable myRunnable = new MyRunnable();
    }
}
