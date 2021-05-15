package com.jimboidin.chapter13.finalQueue;

/*
    Try This 13-1

    Demonstrate a generic queue class.
 */

import java.awt.desktop.SystemEventListener;

public class GenQDemo {
    public static void main(String[] args){
        // Create an integer queue
        Integer[] intStore = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(intStore);

        Integer intVal;

        System.out.println("Demonstrate a queue of Integers.");
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add integer value to q;
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Removing next integer from q: ");
                intVal = q.get();
                System.out.println(intVal);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc);
        }
        System.out.println();

        // Create a Double queue.
        Double[] dStore = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        double dVal;

        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Adding " + (double) i/2 + " to q2");
                q2.put((double) i/2); // add double value to q2
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Getting next double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
