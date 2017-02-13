package com.oracle.design.patterns.and.principles.design.patterns.creational.factory;

/*

As an alternative to using the factory pattern, a developer could implement a set of Animal classes and define a getFood() method
in each class that returns a Food object. The limitation in this solution is that it TIGHTLY COUPLES what an animal is and and food
an animal eats. For example, if a particular food were no longer available, all Animal classes that use the particular food would need
to be changed.

By using the factory pattern, we create a loosely coupled code that is more resistant to changes in animal feeding behaviors.

The Factory pattern is also known as the Factory Method pattern.

Problem: how do we write code that creates objects in which the precise type of the object may not be known until runtime?

The factory pattern is similar to the builder pattern but it is focused on supporting class polymorphism.

See page 99

*/

public class FoodFactory {

    public static Food getFood(String animal) {
        switch(animal) {
            case "zebra" : return new Hay(100);
            case "guinea pig" : return new Hay(3);
            case "rabbit" : return new Carrot(7);
            case "polar bear" : return new Fish(10);
            default : throw new UnsupportedOperationException("Unsupported animal " + animal);  // Good practise to throw an exception when no matching cases are found
        }
    }

}
