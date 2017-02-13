package com.oracle.generics.and.collections.generics;

import java.util.ArrayList;
import java.util.List;

// Raw types are stored as Objects

public class InteractingWithLegacyCode3 {
    public static void main(String args[]) {
        List numbers = new ArrayList();     // Using raw type here
        numbers.add(3);                     // This works because int is autoboxed to Integer
        // int result = numbers.get(0);        // Compilation fails because Object can't be unboxed to int
    }
}
