package com.jimboidin.chapter5;

public class ShowBitsDemo {
    public static void main(String[] args){
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);


        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        i.show(Integer.MAX_VALUE);

        System.out.println("Integer.MAX_VALUE + 1: " + (Integer.MAX_VALUE + 1));
        i.show(Integer.MAX_VALUE + 1);

        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        i.show(Integer.MIN_VALUE);

    }

}

class ShowBits {
    int numbits;

    ShowBits(int n){
        numbits = n;
    }

    void show(long val){
        long mask = 1;

        //left shift a 1 into the proper position
        mask <<= numbits -1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1){
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if (spacer % 8 == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

