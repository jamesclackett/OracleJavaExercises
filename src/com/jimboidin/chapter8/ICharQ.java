package com.jimboidin.chapter8;

import com.jimboidin.chapter9.QueueEmptyException;
import com.jimboidin.chapter9.QueueFullException;

// A character queue interface
public interface ICharQ {
    // Put a character into the queue
    void put(char ch) throws QueueFullException;

    default void testMethod(){
        System.out.println("hi");
    }

    // Get a character from the queue
    char get() throws QueueEmptyException;
}
