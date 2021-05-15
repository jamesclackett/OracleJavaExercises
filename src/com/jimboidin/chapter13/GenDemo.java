package com.jimboidin.chapter13;

import java.util.ArrayList;

class Gen<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to an object of type T.
    Gen(T o){
        ob = o;
    }

    // Return ob
    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }

    void testWildcard(Gen<?> wildcard){
        System.out.println(wildcard.ob.getClass().getName());
    }

    <F, V> void genericMethod(F x, V y, T t){  // T parameter must be the same as invoking obj
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(t.getClass().getName());
    }
}


// Demonstrate the generic class
public class GenDemo {
    public static void main(String[] args){
        // Create a Gen reference for Integers
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its reference to iOb.
        // Notice the use of autoboxing to encapsulate the value 88 within an
        // Integer object.
        iOb = new Gen<>(88);

        // Show the type of data used by iOb
        iOb.showType();

        // Get the value in iOb. Notice that no cast is needed
        int v = iOb.getOb();
        System.out.println("value " + v);
        System.out.println();

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value " + str);
        System.out.println();

        // Test the wildcard argument
        Gen<Double> dObj = new Gen<>(14.5);
        strOb.testWildcard(dObj);
        System.out.println();

        // Test the generic method
        String str2 = "string 2";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        dObj.genericMethod(str2, list, 14.99);
    }
}
