package com.oracle.design.patterns.and.principles.design.patterns.creational.singleton;

// -----------------------------------------------------
// Implementation 1 - using a private static final field and directly initialize it
// or you can use a static initializer block to initialize it
// -----------------------------------------------------

public class HayStoreage {

    private int quantity = 0;
    private HayStoreage() {}    // private constructor, so the class is EFFECTIVELY FINAL

    private static final HayStoreage instance = new HayStoreage();      // using a private static final variable here
                                                                        // the static variable is initialized when the class is LOADED (not when instantiated)
                                                                        // a common name to use is instance

    public static HayStoreage getInstance() {    // public static method, which fetches an instance. Note the getInstance method is NOT synchronized all other methods are
        return instance;
    }

    public synchronized void addHay(int amount) {  // synchronized
        quantity += amount;
    }

    public synchronized boolean removeHay(int amount) {  // synchronized
        if (quantity < amount) return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getHayQuantity() {  // synchronized
        return quantity;
    }
}
