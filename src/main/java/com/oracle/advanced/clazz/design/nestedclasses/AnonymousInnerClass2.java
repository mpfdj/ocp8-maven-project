package com.oracle.advanced.clazz.design.nestedclasses;


class Entrance2 {
    private interface SaleTodayOnly {
        int dollarsOff();
    }

    public int payEntranceFee(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {  // Implementing an interface here
            @Override
            public int dollarsOff() {
                return 3;
            }
        };  // Ad semicolon here!!!
        return basePrice - sale.dollarsOff();
    }
}

public class AnonymousInnerClass2 {
    public static void main(String args[]) {
        Entrance2 entrance = new Entrance2();
        System.out.println(entrance.payEntranceFee(10));
    }
}
