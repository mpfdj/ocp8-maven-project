package com.oracle.generics.and.collections.generics;

/*
There are 3 ways to implement a generic interface:
- specify the generic type with the class
- create a generic class
- use raw types (no generics) --> you get a compiler warning (bad practise)
*/

interface Shippable<T> {
    void ship(T t);
}

class Robot {
}

class ShippableRobotCrate<Robot> implements Shippable<Robot> {  // Specifying the generic type
    @Override
    public void ship(Robot r) {
    }
}

class ShippableAbstractCrate<T> implements Shippable<T> {  // Using generic class
    @Override
    public void ship(T t) {
    }
}

class ShippableCrate implements Shippable {  // Using raw types
    @Override
    public void ship(Object o) {  // Using Object here!
    }
}

public class GenericInterface {
}
