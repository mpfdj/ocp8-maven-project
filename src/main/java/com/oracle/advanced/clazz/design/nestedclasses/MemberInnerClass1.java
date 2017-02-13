package com.oracle.advanced.clazz.design.nestedclasses;

// A MEMBER INNER CLASS is defined at MEMBER LEVEL
// Can be declared public, protected, default or private
// Can extend any class
// Can implement any interface
// CAN'T declare static members
// Can access ALL members of the outer class including private members!
// The compiler creates the following Outer$Inner.class

class Outer {

    private String greeting = "Hi";

    protected class Inner {
        // public static String hello = "HELLO";  // Inner classes can't have static declarations
        public void hello() {
            System.out.println("Hello");
        }
        public void greeting() {
            System.out.println(greeting);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.hello();
        inner.greeting();
    }
}

public class MemberInnerClass1 {

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.callInner();

        Outer outer2 = new Outer();
        Outer.Inner inner = outer2.new Inner();  // Another way to instantiate an inner class
        inner.hello();                           // The inner class is not accessible when declared PRIVATE like any other instance member
                                                 // Please note that the Inner class is called from OUTSIDE the outer class
                                                 // A member inner class needs an instance of the outer class

        // Outer.Inner i = new Outer.Inner();    // error: an enclosing instance that contains Outer.Inner is required
        Outer.Inner i = new Outer().new Inner(); // Inner class needs to be called on an INSTANCE of the Outer class
    }
}
