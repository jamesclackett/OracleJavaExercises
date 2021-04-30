package com.jimboidin.chapter5;

public class Bubble {
    //A Bubble sort example from Chapter 5
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t, size;

        size = 10; // number of elements to sort

        //display original array:
        System.out.println("Original array is:");

        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //This is the Bubble sort:
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--)
                if (nums[b - 1] > nums[b]) { // if out of order then exchange elements
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }

        //display sorted array:
        System.out.println("Sorted array is:");

        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}