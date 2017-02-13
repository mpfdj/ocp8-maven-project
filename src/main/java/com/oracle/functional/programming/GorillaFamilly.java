package com.oracle.functional.programming;



/*
lambda expression can access:
- static variables
- instance variables
- effectively final method parameters
- effectively final local parameters
*/


interface Gorilla {
    String move();
}


public class GorillaFamilly {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
//        approach = "run";/

        play(() -> walk);                               // uses an instance variable
        play(() -> baby ? "hitch a ride" : "walk");     // uses an effectively final method param
        play(() -> approach);                           // uses an effectively fina local variable
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String args[]) {
        GorillaFamilly gorillaFamilly = new GorillaFamilly();
        gorillaFamilly.everyonePlay(true);
    }
}