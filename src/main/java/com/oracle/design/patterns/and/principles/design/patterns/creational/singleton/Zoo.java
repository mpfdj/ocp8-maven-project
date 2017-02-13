package com.oracle.design.patterns.and.principles.design.patterns.creational.singleton;

// There might be multiple Lama trainers is the Zoo BUT ONLY 1 FOOD STORAGE

class LamaTrainer {
    public boolean feedLamas(int numberOfLamas) {
        int amountNeeded = 5 * numberOfLamas;
        HayStoreage hayStoreage = HayStoreage.getInstance();  // get the singleton here
        if (hayStoreage.getHayQuantity() < amountNeeded) {
            hayStoreage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStoreage.removeHay(amountNeeded);
        if(fed) System.out.println("Lames have been fed.");
        return fed;
    }
}

public class Zoo {

    public static void main(String args[]) {
        LamaTrainer trainer1 = new LamaTrainer();
        LamaTrainer trainer2 = new LamaTrainer();

        trainer1.feedLamas(10);
        trainer2.feedLamas(25);

    }
}
