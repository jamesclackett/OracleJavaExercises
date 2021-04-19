package com.jimboidin.chapter5;

public class Bitwise {

    public static void main(String[] args) {
        // write your code here
        short a = 0b11010011;
        short b = 0b10101010;
        short c = (short) (a ^ b);
        int d = a + b;

        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));
        System.out.println("XOR (a ^ b): " + Integer.toBinaryString(c));
        System.out.println("a + b (decimal): " + d);
        System.out.println("a + b (binary): " + Integer.toBinaryString(d));
    }
}

