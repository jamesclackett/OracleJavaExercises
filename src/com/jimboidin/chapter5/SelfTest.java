package com.jimboidin.chapter5;

// Exercise area for Chapter 5's self-test
public class SelfTest {
    public static void main(String[] args){
        double[] valueArray = { 1, 7, 5.5, 9, -1, 6, 6.1, 10, 8, 1};
        question3(valueArray);
        question4();
    }

    static void question3(double[] array){
        // find average of double values
        double total = 0;
        for (double d : array)
            total += d;

        if (array.length != 0) System.out.println(total / array.length);
    }

    static void question4() {
        // write a bubble sort for ints, then write for strings
        int[] array = {14, 2, 0, 19, -1};
        int a, b, temp, size;
        size = 5;

        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--)
                if (array[b-1] > array[b]){
                    temp = array[b-1];
                    array[b-1] = array[b];
                    array[b] = temp;
                }
        for (int i : array) System.out.print(i + " ");

        // now do the same for strings
        System.out.println();
        String[] strArray = {"hello", "bat", "hello2", "fortify", "magic"};
        String tempString;
        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--)
                if (strArray[b - 1].compareTo(strArray[b]) > 0){
                    tempString = strArray[b-1];
                    strArray[b-1] = strArray[b];
                    strArray[b] = tempString;
                }
        for (String str : strArray) System.out.print(str + " ");

        var var = false;
    }

}
