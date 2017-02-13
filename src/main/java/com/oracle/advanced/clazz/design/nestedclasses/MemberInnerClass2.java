package com.oracle.advanced.clazz.design.nestedclasses;

// Inner classes can have the same variable names as outer classes

class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;
            public int y = 40;

            public void printAllX() {
                System.out.println(x);          // 30
                System.out.println(this.x);     // 30
                System.out.println(C.this.x);   // 30
                System.out.println(B.this.x);   // 20
                System.out.println(A.this.x);   // 10
            }
        }
    }
}

public class MemberInnerClass2 {

    public static void main(String args[]) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.printAllX();

        // A.B.C c = new A.B.C();  // Invalid syntax.

        System.out.println(c.y);
    }

}
