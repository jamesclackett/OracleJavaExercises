package com.jimboidin.test;

public class Test {
    public static void main(String[] args){
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        System.out.println(r.getClass());
    }
}
