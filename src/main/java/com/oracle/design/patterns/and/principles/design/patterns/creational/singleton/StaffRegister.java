package com.oracle.design.patterns.and.principles.design.patterns.creational.singleton;

// -----------------------------------------------------
// Implementation 2 - using a private static final field and initialize it via a static initializer block
// Advantage is that you can add more logic in the initializer block...
// -----------------------------------------------------

public class StaffRegister {

    private static final StaffRegister instance;

    static {
        instance = new StaffRegister();
        // do more stuff here...
    }

    private StaffRegister() {}
}
