package com.oracle.advanced.clazz.design.nestedclasses;

// A local inner class is DEFINED WITHIN A METHOD
// Like local variables the inner class declaration doesn't exist until the method is invoked!!!
// And it goes out of scope when the method returns
// YOU CAN ONLY CREATE INSTANCES FROM WITHIN THE METHOD

// They don't have an access modifier
// They can't be static or have static members
// They have access to all fields and methods of the outer class
// They DON'T have access to local variables of the method
// Unless those variables are final or EFFECTIVE FINAL

class Math {
    private int x = 10;

    public void calculate() {
        final int y = 2;

        class Inner {
            public void multiply() {
                System.out.println(x * y);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }
}

public class LocalInnerClass {

    public static void main(String args[]) {
        Math math = new Math();
        math.calculate();
    }

}
