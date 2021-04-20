package com.jimboidin.chapter5;

public class LowCase {
    //class that uses Bitwise OR to lowercase chars
    public static void main(String[] args){
        char ch;

        //print out the Uppercase letter first
        for (int i = 0; i < 10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }

}
