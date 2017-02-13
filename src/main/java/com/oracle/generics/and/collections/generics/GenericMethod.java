package com.oracle.generics.and.collections.generics;

/*
You can declare a generic type on METHOD LEVEL (instead of class or interface level).
This is often useful for static methods as they aren't part of the instance.
The generic type is specified for the return type of the method.
*/

public class GenericMethod {

    public static <T> Crate<T> createCrate(T t) {
        return new Crate<T>();
    }

    public static void main(String args[]) {
        Crate<Elephant> createForElephant = createCrate(new Elephant());

        Crate<Zebra> crateForZebra = GenericMethod.<Zebra>createCrate(new Zebra());  // You can also specify the generic type when calling the method. See page 114

    }

}
