package com.oracle.oca.concepts.cat.species;

import com.oracle.oca.concepts.cat.BigCat;

public class Lynx extends BigCat{
    public static void main(String args[]){
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);  // not accessible via variable
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);

        Lynx cat2 = new Lynx();
        System.out.println(cat2.name);
        System.out.println(cat2.hasFur);  // accessible via inheritance
//        System.out.println(cat2.hasPaws);
//        System.out.println(cat2.id);
    }
}
