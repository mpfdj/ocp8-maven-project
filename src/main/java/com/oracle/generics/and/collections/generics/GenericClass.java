package com.oracle.generics.and.collections.generics;

/*
Declare a formal type parameter in <T>
The generic type T is available ANYWHERE in the class
The Crate class is used to ship animals between different Zoo's
After compilation all generics are just of type Object, this is known as type erasure page 112
Type erasure allows you code to be compatible with older versions of Java (JRE's)
*/

class Elephant {
}

class Zebra {
}

class Crate<T> {
    private T contents;

    public T getContents() {
        return contents;
    }

    public void putInCrate(T contents) {
        this.contents = contents;
    }
}

public class GenericClass {
    public static void main(String args[]) {
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.putInCrate(new Elephant());
        Elephant elephantInNewZoo = crateForElephant.getContents();

        Crate<Zebra> crateForZebra = new Crate<>();
        crateForZebra.putInCrate(new Zebra());
        Zebra zebraInNewZoo = crateForZebra.getContents();

        // This compiler adds the type cast
        // Zebra zebraInNewZoo = (Zebra) crateForZebra.getContents();
    }
}
