package com.jimboidin.chapter12;

enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;

    Transport(int speed) {
        this.speed = speed;
    }

    int getSpeed(){ return speed; }
}


public class EnumDemo3 {
    public static void main(String[] args){
        Transport tp;

        // Display the speed of an airplane
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        // Display all Transports and speeds
        System.out.println("All transport speeds:");
        for (Transport t : Transport.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles " +
                    "per hour.");
    }
}
