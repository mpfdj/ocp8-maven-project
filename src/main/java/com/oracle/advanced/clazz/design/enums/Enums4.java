package com.oracle.advanced.clazz.design.enums;

public class Enums4 {

    // This is a better implementation, because it has a DEFAULT IMPLEMENTATION and the specific cases are overriden

    private enum Season {
        WINTER {
            @Override public void printHours() { System.out.println("9am-3pm"); }
        },
        SUMMER {
            @Override public void printHours() { System.out.println("9am-7pm"); }
        },
        SPRING, FALL;

        public void printHours() {  // Providing a DEFAULT IMPLEMENTATION here and OVERRIDE it only for the SPECIAL CASES.
            { System.out.println("9am-5pm"); }
        }
    }

    public static void main(String args[]) {
        Season.WINTER.printHours();
        Season.SPRING.printHours();
        Season.SUMMER.printHours();
        Season.FALL.printHours();
    }
}
