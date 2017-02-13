package com.oracle.generics.and.collections.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String args[]) {
        List<String> animals = new ArrayList<>();
        animals.add("buffalo");
        animals.add("elephant");
        animals.add("lion");
        animals.add("leopard");
        animals.add("rhinoceros");

        // Looping through a list

        // 1. Enhanced for-loop
        for (String animal : animals) {
            System.out.print(animal + ", ");
        }

        System.out.println();

        // 2. Before Java 5
        Iterator iterator = animals.iterator();  // <-- raw Iterator
        while (iterator.hasNext()) {
            String animal = (String) iterator.next();  // Type cast required (IteratorExample is a raw type)
            System.out.print(animal + ", ");
        }

        System.out.println();

        // 3. Hybrid solution using Iterator with generics
        Iterator<String> iterator2 = animals.iterator();  // <-- Iterator with generics
        while (iterator2.hasNext()) {
            String animal = iterator2.next();  // NO type cast required
            System.out.print(animal + ", ");
        }
    }

}
