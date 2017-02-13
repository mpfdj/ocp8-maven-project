package com.oracle.advanced.clazz.design.object;

public class Miel {

    private String lastName = "De Jaeger";
    private int age = 36;

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Miel)) return false;
        Miel otherMiel = (Miel) o;
        return this.lastName.equals(otherMiel.lastName);
    }

    @Override
    public int hashCode() {
        return age;  // Bad practise should be a SUBSET of variables used in equals!!!
    }
}
