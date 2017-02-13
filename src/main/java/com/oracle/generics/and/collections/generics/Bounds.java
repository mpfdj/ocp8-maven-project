package com.oracle.generics.and.collections.generics;
/*
See page 117
You might have noticed that generics don't seem useful since they are treated as Objects and therefore DON'T HAVE MANY METHODS AVAILABLE.
BOUNDED WILDCARDS solve this by restricting what types can be used in that WILDCARD POSITION.

PLS NOTE THE DIFFERENCE BETWEEN THE REFERENCE TYPE AND THE OBJECT TYPE!!!

unbounded wildcard          ?                   IteratorExample<?> l = new ArrayList<String>();
wildcard with upperbound    ? extends type      IteratorExample<? extends Exception> l = new ArrayList<RunTimeException>();
wildcard with lowerbound    ? extends type      IteratorExample<? super Exception> l = new ArrayList<Object>();

POLYMORPHISM, POLYMORPHISM, POLYMORPHISM doesn't work with generics use (bounded) wildcards instead
When using a upper bound wildcard methods become available!!!

When using upper bounds or unbounded wildcards the ArrayList becomes logically IMMUTABLE --> immutable means the object can't be modified!

*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface Dancing {
    public void dance();
}

class Miel implements Dancing {
    @Override
    public void dance() {
        System.out.println("Do the Miel-dance!");
    }
}

class Kim extends Miel {
    @Override
    public void dance() {
        System.out.println("Do the Kimmie-dance!");
    }
}


public class Bounds {

    public static void printListUsingObject(List<Object> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    public static void printListUsingWildcard(List<?> list) {  // Using a wildcard (NO bounds) only provides a reference to Object!
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    public static void makeHappyPeopleDance(List<? extends Dancing> happyPeople) {  // When using a upper bound wildcard methods become available!!!
        for (Dancing d : happyPeople) {
            d.dance();
        }
    }



    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("aap");
        //printListUsingObject(list);  // POLYMORPHISM, POLYMORPHISM, POLYMORPHISM doesn't work with generics use (bounded) wildcards instead
        printListUsingWildcard(list);


        // ------------------------------------------------------
        // Storing the wrong Objects - Arrays versus ArrayList
        // ------------------------------------------------------
        // IteratorExample<Objects> l = new ArrayList<String>();   // This is not allowed!!!
        List<?> l = new ArrayList<String>();            // This is allowed!!! Use a wildcard instead
        Object[] o = new String[0];                     // This ia allowed

        Integer[] numbers = {7};
        Object[] objects = numbers;
        //objects[0] = "zeven";  // This COMPILES but throws an java.lang.ArrayStoreException

        // With Arrays, Java knows what OBJECT type is allowed (at runtime)
        // In this example we've assigned an Object[] to an Integer[] but Java knows it's OBJECT TYPE which is really of type Integer[]

        // Due type erasure we have no such protection for generics. At runtime ArrayList doesn't know what is allowed (since everything is an Object).
        // Therefore Java uses the compiler to prevent this situation


        // ------------------------------------------------------
        // Using upper bound wildcard
        // ------------------------------------------------------

        // IteratorExample<Miel> happyPeople = new ArrayList<Kim>();  // Not allowed
        List<Miel> happyPeople = new ArrayList<>();
        happyPeople.add(new Miel());
        happyPeople.add(new Kim());  // <== subclasses can be added though!!! IS-A

        List<Kim> happyPeople2 = new ArrayList<>();
        //happyPeople2.add(new Miel());  // <== Miel IS NOT A Kim

        // IteratorExample<Dancing> happyPeople3 = happyPeople;        // Doesn't compile
        List<? extends Dancing> happyPeople4 = happyPeople; // To use POLYMORPHISM use a upper / lower bound wildcard instead!

        makeHappyPeopleDance(happyPeople4);                 // Using a POLYMORPHIC method argument

        // happyPeople4.add(new Miel());                    // When using upper bound the Object become logically immutable same goes for unbounded wildcard


        // ------------------------------------------------------
        // Using lower bound wildcard
        // ------------------------------------------------------
        List<? super Kim> happyPeople5 = new ArrayList<>();
        happyPeople5.add(new Kim());
        // happyPeople5.add(new Miel());  // <== Miel IS NOT A Kim


        List<? super IOException> exceptions = new ArrayList<Exception>();
        // exceptions.add(new Exception());  // IS NOT a IOException
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

    }
}
