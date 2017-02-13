package com.oracle.advanced.clazz.design.enums;


public class Enums2 {

    // Our zoo wants to keep track of traffic patterns for which seasons get the most visitors
    // Using a PRIVATE CONSTRUCTOR and STATE and combining with public methods

    private enum Season {

        WINTER("low"), SPRING("medium"), SUMMER("high"), FALL("medium");

        private String expectedVisitors;

        private Season(String expectedVisitors) {  // The CONSTRUCTOR must be PRIVATE
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {  // Other methods can be public
            System.out.println(expectedVisitors);
        }
    }

    public static void main(String args[]) {
        Season summer = Season.SUMMER;
        summer.printExpectedVisitors();
    }
}
