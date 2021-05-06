package com.jimboidin.chapter8;

// A character queue interface
public interface ICharQ {
    // Put a character into the queue
    void put(char ch);

    default void testMethod(){
        System.out.println("hi");
    }

    // Get a character from the queue
    char get();
}
