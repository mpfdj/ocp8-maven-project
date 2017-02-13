package com.oracle.advanced.clazz.design.nestedclasses;

class Entrance3 {
    private interface SaleTodayOnly {
        int dollarsOff();
    }

    public int payEntranceFee(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    public int pay() {
        return payEntranceFee(10, new SaleTodayOnly() {  // Anonymous local inner class as method argument
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }
}

public class AnonymousInnerClass3 {
    public static void main(String args[]) {
        Entrance3 entrance = new Entrance3();
        entrance.pay();
    }
}
