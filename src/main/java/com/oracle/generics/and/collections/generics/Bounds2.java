package com.oracle.generics.and.collections.generics;


import java.util.ArrayList;
import java.util.List;

class A {
    public void helloA() {
        System.out.println("A is saying hello.");
    }
}

class B extends A {
    public void helloB() {
        System.out.println("B is saying hello.");
    }
}

class C extends B {
    public void helloC() {
        System.out.println("C is saying hello.");
    }
}

public class Bounds2 {

    public static void printUsingLowerBound(List<? super C> alphabet) {
//        for (C c : alphabet) {
//
//        }
    }

    public static void printUsingUpperBound(List<? extends A> alphabet) {
        for (A a : alphabet) {

        }
//        for (C c : alphabet) {
//
//        }
    }

    public static void main(String args[]) {

        List<? super C> alphabet1 = new ArrayList<A>();
//        alphabet1.add(new A());
//        alphabet1.add(new B());
        alphabet1.add(new C());

        List<? extends A> alphabet2 = new ArrayList<C>();  // Upper bound is logically immutable
//        alphabet2.add(new A());
//        alphabet2.add(new B());
//        alphabet2.add(new C());

        List<?> alphabet3 = new ArrayList<>();  // Wildcard is logically immutable
//        alphabet3.add(new A());
//        alphabet3.add(new B());
//        alphabet3.add(new C());

        List<A> alphabet4 = new ArrayList<>();
        alphabet4.add(new A());
        alphabet4.add(new B());
        alphabet4.add(new C());

        List<C> listOfC = new ArrayList<>();
//        IteratorExample<B> listOfB = listOfC;

        List<?> xs = listOfC;
        List<? extends B> bUsingUpperBound = listOfC;
//        IteratorExample<? super B> bUingLowerBound = listOfC;
        List<? super C> cUingLowerBound = listOfC;


        // page 123
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
//        IteratorExample<? extends B> list4 = new ArrayList<A>();
        List<? super B> list5 = new ArrayList<A>();
//        IteratorExample<?> list5 = new ArrayList<? extends A>();


    }

    // page 124
    public static <T> T test1(List<? extends T> list) {
        return list.get(0);
    }

//    public static <T> <?extends T> test2(IteratorExample<? extends T> list) {  // not allowed to use a upper / lower bound wildcard in return type
//        return list.get(0);
//    }

    public static <B extends A> B test3(List<B> list) {  // allowed since B is used as a TYPED METHOD PARAM (not referring to class B)
        return list.get(0);
    }

    public static void test4(List<? super B> list) {

    }

//    public static void <X> X test5(IteratorExample<X super B> list) {  // upper / lower bound can only apply to a wildcard ?
//        return list.get(0);
//    }
}