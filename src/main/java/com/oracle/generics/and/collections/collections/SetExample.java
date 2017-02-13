package com.oracle.generics.and.collections.collections;

/*
Set:
- HashSet (calls hashCode())
- TreeSet (calls compareTo(), no null values, implements NavigableSet)

*/

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]) {

        // Set<int> numbers = new HashSet<>();  // Primitives are not allowed in collections use Wrapper classes instead.

        // see page 133
        Set<Integer> numbers = new HashSet<>();
        numbers.add(66);
        numbers.add(10);
        numbers.add(66);  // <-- duplicate
        numbers.add(8);
        System.out.println(numbers);  // Prints values in arbitrary/random order


        Set<Integer> numbersSorted = new TreeSet<>();
        numbersSorted.add(66);
        numbersSorted.add(10);
        numbersSorted.add(66);  // <-- duplicate
        numbersSorted.add(8);
        System.out.println(numbersSorted);  // Printed out in natural order. Alphanumeric order is digit, uppercase, lowercase.
        // Numbers implement the Comparable interface (compareTo())

        // see page 134
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 20; i++) set.add(i);
        System.out.println(set.lower(10));      // 9 return greatest element < e
        System.out.println(set.floor(10));      // 10 return greatest element <= e
        System.out.println(set.ceiling(10));    // 10 return smallest element >= e
        System.out.println(set.higher(10));     // 11 return smallest element > e
    }

}
