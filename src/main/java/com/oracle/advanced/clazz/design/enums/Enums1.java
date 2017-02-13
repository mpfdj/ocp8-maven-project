package com.oracle.advanced.clazz.design.enums;

// In Java an enum is a CLASS that represents an enumeration (opsomming)
// They are the same a static final constants
// You can't extend an enum
// Each enum value can also contain state
// Enums are a set of items whose types are known compile time (days of the week, months of the year, cards in a deck, etc.)
// Enums have helper methods like name(), values(), ordinal(), valueOf()

public class Enums1 {

    private enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String args[]) {

        System.out.println(Season.SUMMER);  // Calls name()
        Season season = Season.SUMMER;
        System.out.println(season == Season.SUMMER);        // Using == operator

        for (Season s : Season.values()) {
            System.out.println(s.name() + " " + s.ordinal());
        }

        // System.out.println(Season.SUMMER == 2);  // You CAN'T compare an int with an enum directly; Enum is a reference type and int is a primitive.
        System.out.println(Season.SUMMER.ordinal() == 2);  // You CAN'T compare an int and an enum directly; Enum is a reference type and int is a primitive.

        // You can also create an enum from a String (is helpful when working with older code)
        Season summer = Season.valueOf("SUMMER");
        Season winter = Season.valueOf("winter");  // Throws an IllegalArgumentException must be UPPERCASE


    }
}
