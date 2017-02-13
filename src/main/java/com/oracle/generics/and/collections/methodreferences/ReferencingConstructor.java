package com.oracle.generics.and.collections.methodreferences;

import java.util.GregorianCalendar;
import java.util.function.Supplier;

/*
    --> Supplier<T> <--

    T get()

    Gets a result.

    Returns: a result

*/


public class ReferencingConstructor {

    public GregorianCalendar operC(Supplier<GregorianCalendar> supplier) {
        return supplier.get();
    }

    public static void main(String args[]) {
        ReferencingConstructor ex = new ReferencingConstructor();

        ex.operC(()->{ return new GregorianCalendar();});
        ex.operC(GregorianCalendar::new);
    }

}