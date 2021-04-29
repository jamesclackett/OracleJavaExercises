package com.jimboidin.chapter5;

//Understand how Java uses Two's complement;
public class BinaryTests {
    public static void main(String[] args){

        int c = -2147483648;
        System.out.println(Integer.toBinaryString(c) + ", " + c);
        c = c >>> 1;
        System.out.println(Integer.toBinaryString(c) + ", " + c);
    }
    

}
