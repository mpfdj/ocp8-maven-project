package com.oracle.design.patterns.and.principles.design.patterns.creational.immutable;

/*
- use a constructor to set all properties
- all fields should be private final
- no setters
- NEVER SHARE REFERENCES to a mutable field (always make a defensive copy)
- prevent methods from being overridden (class or all methods should be final)
*/

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Animal {  // Class or methods should be final

    // Fields should be private final
    private final String species;  // STRING IS IMMUTABLE
    private final int age;
    private final List<String> favoriteFoods;  // IteratorExample is mutable

    // Constructor should set all fields (no setters)
    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new IllegalArgumentException("favoriteFoods is required.");  // Invariant property (page 66)
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);  // Make a defensive copy here
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteFoods() {
        return new ArrayList<>(favoriteFoods);  // Make a defensive copy here
    }

    @Override
    public String toString() {
       return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public static void main(String args[]) {
        Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));
        System.out.println(lion);
    }
}
