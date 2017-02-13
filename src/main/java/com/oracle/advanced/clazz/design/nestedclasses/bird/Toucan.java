package com.oracle.advanced.clazz.design.nestedclasses.bird;

// A STATIC NESTED CLASS is NOT an inner class
// It is defined a member level
// The outer class can access members of the static nested class

public class Toucan {

    public static class Beak {
        public void picking() {
            System.out.println("picking");
        }
    }

}
