package com.oracle.design.patterns.and.principles.design.patterns.creational.factory;

public class Hay extends Food {

    public Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}
