package com.oracle.design.patterns.and.principles;

// A functional interface has exactly 1 abstract method
// Use the following annotation @FunctionalInterface
class Animal {
}

class Tortoise extends Animal {
}

class Hare extends Animal {
}

class Kangaroo extends Animal {
}

class Tiger implements Sprint {
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast.");
    }
}

@java.lang.FunctionalInterface
interface Sprint {
    void sprint(Animal animal);
}

// Other valid functional interfaces are defined below (the all have 1 abstract method)
interface Run extends Sprint {
}

interface SprintFaster extends Sprint {
    void sprint(Animal animal);
}

interface Skip extends Sprint {
    default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }

    static void skip(int speed) {
    }
}

public class FunctionalInterface {
}
