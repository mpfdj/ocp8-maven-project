package com.oracle.advanced.clazz.design.nestedclasses;


// An anonymous inner class is a local inner class that doesn't have a name.
// It's declared an instantiated in one statement using the keyword new.
// An anonymous inner class EXTENDS AN ABSTRACT CLASS or IMPLEMENTS AN INTERFACE
// It is useful when you have a short implementation that will not be used anywhere else
// Can be defined as a LOCAL VARIABLE or as a METHOD PARAM

class Entrance1 {
    private abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int payEntranceFee(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {  // Extends an abstract class here
            @Override
            int dollarsOff() {
                return 3;
            }
        };  // Note the semicolon here, because the anonymous inner class is declared the same way as a LOCAL VARIABLE!

        return basePrice - sale.dollarsOff();
    }
}

public class AnonymousInnerClass1 {
    public static void main(String args[]) {
        Entrance1 entrance = new Entrance1();
        System.out.println(entrance.payEntranceFee(10));
    }
}
