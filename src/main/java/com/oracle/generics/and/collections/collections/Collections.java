package com.oracle.generics.and.collections.collections;

import java.util.ArrayList;
import java.util.List;
/*

Collections interface:
        - add(E element)
        - remove(int index)
        - remove(Object o)  // removes the first match
        - isEmpty()
        - size()
        - clear()
        - contains(Object o)

*/
public class Collections {


    public static void main(String args[]) {
        List<String> animals = new ArrayList<>();
        animals.add("buffalo");
        animals.add("elephant");
        animals.add("lion");
        animals.add("leopard");
        animals.add("rhinoceros");

        System.out.println("size: " + animals.size());
        System.out.println("contains lion: " + animals.contains("lion"));
        System.out.println("contains hippo: " + animals.contains("hippo"));

        animals.remove("lion");
        System.out.println("size: " + animals.size());
        System.out.println("isEmpty: " + animals.isEmpty());

        animals.clear();
        System.out.println("size: " + animals.size());
        System.out.println("isEmpty: " + animals.isEmpty());
    }

}
