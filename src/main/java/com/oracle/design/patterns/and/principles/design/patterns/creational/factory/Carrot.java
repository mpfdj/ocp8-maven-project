package com.oracle.design.patterns.and.principles.design.patterns.creational.factory;

public class Carrot extends Food {

    public Carrot(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Carrots eaten: " + getQuantity());
    }
}
