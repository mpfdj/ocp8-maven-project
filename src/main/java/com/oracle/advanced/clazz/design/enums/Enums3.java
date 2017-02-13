package com.oracle.advanced.clazz.design.enums;

public class Enums3 {

    private enum Season {
        WINTER {
            @Override public void printHours() { System.out.println("9am-3pm"); }
        },
        SPRING {
            @Override public void printHours() { System.out.println("9am-5pm"); }
        },
        SUMMER {
            @Override public void printHours() { System.out.println("9am-7pm"); }
        },
        FALL {
            @Override public void printHours() { System.out.println("9am-5pm"); }
        };

        public abstract void printHours();  // The enum class has an abstract method. EACH ENUM MEMBER MUST IMPLEMENT THIS METHOD.
    }

    public static void main(String args[]) {
        Season.WINTER.printHours();
        Season.SPRING.printHours();
        Season.SUMMER.printHours();
        Season.FALL.printHours();
    }

}
