package com.jimboidin.chapter5;

public class UpCase {

    public static void main(String[] args) {
        // write your code here
        short a = 0b11010011;
        short b = 0b10101010;
        short c = (short) (a ^ b);
        System.out.print(Integer.toBinaryString(c));
    }
}

