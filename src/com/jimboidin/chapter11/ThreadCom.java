package com.jimboidin.chapter11;


class TickTock {
    String state; // contains the state of the clock

    synchronized void tick(boolean running){
        if (!running) { // stop the clock
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked

        notify();
        try {
            while (!state.equals("tocked"))
                wait();
        }
        catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running){
        if (!running) { //stop the clock
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        state = "tocked";

        notify(); // let tick() run
        try {
            while (!state.equals("ticked"))
                wait(); // wait for tick to complete
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted");
        }
    }
}

class ClockThread implements Runnable{
    Thread thread;
    TickTock ttOb;

    // Construct a new thread
    ClockThread(String name, TickTock tt){
        thread = new Thread(this, name);
        ttOb = tt;
    }

    // A factory method that creates and starts a thread
    public static ClockThread createAndStart(String name, TickTock tt){
        ClockThread clockThread = new ClockThread(name, tt);
        clockThread.thread.start();
        return clockThread;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

public class ThreadCom {
    public static  void main(String[] args){
        TickTock tt = new TickTock();
        ClockThread clockThread1 = ClockThread.createAndStart("Tick", tt);
        ClockThread clockThread2 = ClockThread.createAndStart("Tock", tt);

        try {
            clockThread1.thread.join();
            clockThread2.thread.join();
        } catch (InterruptedException exc){
            System.out.println("Main thread interrupted");
        }
    }
}
