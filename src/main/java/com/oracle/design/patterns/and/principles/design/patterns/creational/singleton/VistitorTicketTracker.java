package com.oracle.design.patterns.and.principles.design.patterns.creational.singleton;

// -----------------------------------------------------
// Implementation 3 - applying lazy instantiation
// The creation of the singleton is delayed until the first time the getInstance() method is called (requested by the client)
// volatile prevents a subtle case where the compiler tries to optimized the code such that the object is accessed before it is finished being constructed
// This implementation uses synchronisation the only first time so this is very effective when the getInstance is called often
// This implementation does DOUBLE-CHECKED LOCKING (a design pattern which first tests if synchronisation is needed before actually acquiring any locks)
// -----------------------------------------------------
public class VistitorTicketTracker {

    private static volatile VistitorTicketTracker instance;  // NOT final here and VOLATILE

    private VistitorTicketTracker() {}

    public static VistitorTicketTracker getInstance() {
        if (instance == null) {
            synchronized (VistitorTicketTracker.class) {
                if (instance == null) {
                    instance = new VistitorTicketTracker();
                }
            }
        }
        return instance;
    }

    // Data access methods ...
}
