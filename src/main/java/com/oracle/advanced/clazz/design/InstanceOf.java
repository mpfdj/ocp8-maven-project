package com.oracle.advanced.clazz.design;

class Piet {}
class Miel {}
class Kim extends Miel {}
class Isabella extends Miel {}
interface DeJaeger {}

public class InstanceOf {

    public static void main(String[] args) {

        Kim kim = new Kim();

        boolean b1 = kim instanceof Kim;
        boolean b2 = kim instanceof Miel;
//        boolean b3 = kim instanceof Piet;      // Compiler error inconvertible types
//        boolean b4 = kim instanceof Isabella;  // Compiler error inconvertible types
        boolean b5 = kim instanceof DeJaeger;    // An interface is always allowed when calling instanceof (because there might be a SUBCLASS implementing that interface)
        boolean b6 = kim instanceof Object;      // Always true

        System.out.println(b1);  // true
        System.out.println(b2);  // true
        System.out.println(b5);  // false
        System.out.println(b6);  // true

        Miel miel = null;
        boolean b7 = miel instanceof Object;
        // boolean b8 = miel instanceof null;  // Not a statement
        boolean b9 = miel instanceof Kim;

        System.out.println(b7);  // false (null != Object)
        System.out.println(b9);  // false

    }
}
