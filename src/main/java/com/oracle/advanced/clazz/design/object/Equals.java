package com.oracle.advanced.clazz.design.object;

import org.apache.commons.lang3.builder.EqualsBuilder;

class Lion {
    private int id;
    private int age;
    private String name;

    public Lion(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;                // Guard condition, to prevent NullPointerException
        if (!(o instanceof Lion)) return false;     // Guard condition, to prevent ClassCastException
        Lion otherLion = (Lion) o;                  // Downcast to Lion
        return this.id == otherLion.id;
    }
    */

/*
    @Override
    public boolean equals(Object o) {               // Use apache commons lang to compare ALL fields
        if (o == null) return false;                // Guard condition, to prevent NullPointerException
        if (!(o instanceof Lion)) return false;     // Guard condition, to prevent ClassCastException
        return EqualsBuilder.reflectionEquals(this, o);  // Using Apache commons lang comparing ALL fields
    }
    */

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;                // Guard condition, to prevent NullPointerException
        if (!(o instanceof Lion)) return false;     // Guard condition, to prevent ClassCastException
        Lion otherLion = (Lion) o;                  // Downcast to Lion
        return new EqualsBuilder()                  // Using Apache commons lang comparing TWO fields
                .append(this.id, otherLion.id)
                .append(this.name, otherLion.name)  // page 18
                .build();
    }

}

public class Equals {

    public static void main(String args[]) {
        Lion lion1 = new Lion(1, 36, "miel");
        Lion lion2 = new Lion(2, 7, "kim");
        Lion lion3 = new Lion(1, 100, "miel");
        Lion lion4 = null;

        System.out.println(lion1.equals(lion2));
        System.out.println(lion1.equals(lion3));
        // System.out.println(lion4.equals(null)); // NullPointerException because lion4 is null
    }
}
