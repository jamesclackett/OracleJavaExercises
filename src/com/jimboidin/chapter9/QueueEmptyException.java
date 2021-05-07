package com.jimboidin.chapter9;

public class QueueEmptyException extends Exception{

    public String toString() {
        return "\nQueue is empty.";
    }
}
