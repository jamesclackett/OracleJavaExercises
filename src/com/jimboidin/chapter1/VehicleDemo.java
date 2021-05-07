package com.jimboidin.chapter1;

import java.io.IOException;

public class VehicleDemo {

    public static void main(String[] args) throws IOException {
        Vehicle minivan = new Vehicle(1, 1, 1);

        System.out.println(minivan.fuelcap);
    }
}

class Vehicle {
    int passengers, fuelcap, mpg;

    Vehicle(int fuelcap, int mpg, int passengers) {
        this.fuelcap = fuelcap;
        this.mpg = mpg;
        this.passengers = passengers;
    }
}

