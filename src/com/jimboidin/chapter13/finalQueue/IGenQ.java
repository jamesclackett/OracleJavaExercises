package com.jimboidin.chapter13.finalQueue;

// A generic queue interface
public interface IGenQ<T> {
    // Put an item into the queue
    void put (T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}
