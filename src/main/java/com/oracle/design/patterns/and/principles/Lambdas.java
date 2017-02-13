package com.oracle.design.patterns.and.principles;


import java.util.function.Predicate;

public class Lambdas {

    private class Animal {
        private String species;
        private boolean canHop;
        private boolean canSwim;

        private Animal(String species, boolean canHop, boolean canSwim) {
            this.species = species;
            this.canHop = canHop;
            this.canSwim = canSwim;
        }

        @Override
        public String toString() {
            return species;
        }
    }

    //  f(x) = test(x)
//  Predicate is a boolean-valued function
    private static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String args[]) {
        Lambdas outer = new Lambdas();

        Animal fish = outer.new Animal("fish", false, true);
        print(fish, a -> a.canSwim);  // prints animal when canSwim is true

        Animal kangaroo = outer.new Animal("kangaroo", true, false);  // prints animal when canHop is true
        print(kangaroo, a -> a.canHop);
    }

}
