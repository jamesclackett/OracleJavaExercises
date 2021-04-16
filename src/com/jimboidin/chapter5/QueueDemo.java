package com.jimboidin.chapter5;

public class QueueDemo {

    public static void main(String[] args) {
        // Test the Queue class
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        //retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        //now use smallQ to generate some errors
        System.out.println("Using smallQ to generate errors.\n");
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store: " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        //more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

class Queue {
    private char[] q; //this array holds the queue
    private int putloc, getloc; //the put and get indices

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.print(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (putloc == getloc) {
            System.out.print(" - Queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }


}
