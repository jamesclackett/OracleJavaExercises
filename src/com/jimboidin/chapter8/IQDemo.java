package com.jimboidin.chapter8;
import com.jimboidin.chapter9.QueueFullException;
import com.jimboidin.chapter9.QueueEmptyException;

public class IQDemo {
    public static void main(String[] args){
        FixedQueue q = new FixedQueue(10);
        char ch; int i;

        try {
            // overrun the queue
            for (i = 0; i < 11; i++){
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            //over-empty the queue
            for (i = 0; i < 11; i++){
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }






    }
}


// A fixed-size queue class for characters
// 07/05/21 Updated to throw custom Exceptions from chapter 9.
class FixedQueue implements ICharQ{
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size
    public FixedQueue(int size){
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue
    @Override
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length){
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue
    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc){
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}

// A circular queue
class CircularQueue implements  ICharQ{
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    public CircularQueue(int size){
        // allocate memory for queue. 'size+1' because an extra space makes checks easier
        q = new char[size+1];
        putloc = getloc = 0;
    }

    // Put a character into the queue
    @Override
    public void put(char ch) {
        /*  Queue is full if either putloc is one less than getloc,
            or if putloc is at the end of the array and getloc is
            at the beginning. */
        if (putloc+1 == getloc | ((putloc==q.length-1) & (getloc==0))){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // loop back
    }

    // Get a character from the queue
    @Override
    public char get() {
        if (getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // loop back
        return ch;
    }
}
