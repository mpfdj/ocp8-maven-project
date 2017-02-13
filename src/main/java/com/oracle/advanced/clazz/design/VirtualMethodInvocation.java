package com.oracle.advanced.clazz.design;

// Calling a method that is overridden is also called virtual method invocation
// The implementation is determined at runtime by the Object type

abstract class Animal {
    public abstract void feed();  // The method feed, DELEGATES to the private CLASS-SPECIFIC METHOD
}

class Cow extends Animal {
    public void feed() { addHay(); }
    private void addHay() { System.out.println("Adding hay."); }
}

class Bird extends Animal {
    public void feed() { addSeed(); }
    private void addSeed() { System.out.println("Adding seed."); }
}

class Lion extends Animal {
    public void feed() { addMeat(); }
    private void addMeat() { System.out.println("Adding meat."); }
}

public class VirtualMethodInvocation {

    private static void feedAnimal(Animal animal) {
        animal.feed();
    }
    public static void main(String args[]) {
        feedAnimal(new Lion());
        feedAnimal(new Bird());
    }
}
