package com.oracle.design.patterns.and.principles.design.patterns.creational.builder;

// Builder is defined as a static inner class

import java.util.Arrays;

public class AnimalTest {

    public static void main(String args[]) {
        Animal lion = new Animal.AnimalBuilder()
                .setSpecies("lion")
                .setAge(5)
                .setFavoriteFoods(Arrays.asList("meat", "more meat"))
                .build();

        Animal guineaPig = new Animal.AnimalBuilder()
                .setSpecies("guinea pig")
                .setFavoriteFoods(Arrays.asList("bell pepper", "hay"))
                .build();

        System.out.println(lion);
        System.out.println(guineaPig);

    }

}
