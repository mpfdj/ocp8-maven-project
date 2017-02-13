package com.oracle.advanced.clazz.design.nestedclasses;


import com.oracle.advanced.clazz.design.nestedclasses.bird.Toucan.Beak;  // Regular import
// import static Toucan.Beak;  // Static import is also allowed

public class StaticNestedClass {

    public static void main(String args[]) {
        Beak beak = new Beak();
        beak.picking();
    }
}
