package com.oracle.generics.and.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class InteractingWithLegacyCode2 {

    public static void addUnicorn(List unicorns) {  // Using raw type here!
        unicorns.add(new Dragon());                 // This is legal because it's reference is a raw type (IteratorExample of Objects)
    }

    public static void main(String args[]) {
        List<Unicorn> unicorns2 = new ArrayList<>();
        addUnicorn(unicorns2);
        Unicorn unicorn = unicorns2.get(0);  // ClassCastException
    }
}
