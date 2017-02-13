package com.oracle.generics.and.collections.generics;

/*
Be careful when you see code that doesn't use generics.
When some code uses generics and other code doesn't it's easy to get lulled into FALSE SECURITY.
Generics is used to give us COMPILE TIME SAFETY.

The following situations might occur:
- compiler warnings
- ClassCastExceptions
- compiler errors
*/

import java.util.ArrayList;
import java.util.List;

class Dragon {
}

class Unicorn {
}


public class InteractingWithLegacyCode {

    public static void printLegacyDragons(List<Dragon> dragons) {
        for (Dragon d: dragons) {  // ClassCastException
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        List unicorns = new ArrayList();  // Using raw type here, gives a compiler warning
        unicorns.add(new Unicorn());
        printLegacyDragons(unicorns);  // This is legal because a raw type is passed in
    }

}
