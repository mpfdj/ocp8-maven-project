package com.oracle.design.patterns.and.principles.design.patterns.creational.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

// Immutable class with a private constructor so the client is forced to use the Builder
// The Builder and the target class are TIGHTLY COUPLED
// The builder class is normally shipped in the SAME PACKAGE as the target class
// Or is defined as a STATIC INNER CLASS within the target class

// The builder class is mutable
// The target class is immutable


public final class  Animal {

    public static class AnimalBuilder {
        private String species;  // Fields are set with defaults
        private int age;
        private List<String> favoriteFoods;

        public AnimalBuilder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public AnimalBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
            this.favoriteFoods = favoriteFoods;
            return this;
        }

        public Animal build() {
            return new Animal(species, age, favoriteFoods);
        }
    }

    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    private Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new IllegalArgumentException("favoriteFoods is required.");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteFoods() {
        return new ArrayList<>(favoriteFoods);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
