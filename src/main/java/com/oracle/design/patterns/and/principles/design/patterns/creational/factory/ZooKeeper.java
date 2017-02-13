package com.oracle.design.patterns.and.principles.design.patterns.creational.factory;

public class ZooKeeper {

    public static void main(String args[]) {
        Food food = FoodFactory.getFood("guinea pig");
        food.getQuantity();
    }

}
