package com.oracle.generics.and.collections.collections;

/*

ListExample interface:
        - add(E element)
        - add(int index, E element)  // insert a value
        - get(int index)
        - indexOf(Object o)
        - lastIndexOf(Object o)
        - remove(int index)
        - set(int index, E element)  // replace a value

List:
- ArrayList
- LinkedList
- Stack
- Vector --> legacy

*/

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String args[]) {
        List<String> animals = new ArrayList<>();
        animals.add("buffalo");
        animals.add("elephant");
        animals.add("lion");
        animals.add("leopard");
        animals.add("rhinoceros");
        animals.add("lion");

        System.out.println(animals.get(0));

        System.out.println(animals.indexOf("lion"));

        System.out.println(animals.lastIndexOf("lion"));

        animals.remove(0);
        animals.remove("lion");

        animals.set(0, "monkey");

        System.out.println(animals);
    }

}
