package com.oracle.generics.and.collections.methodreferences;

import java.util.function.Function;


/*
        --> Function<T,R> <---

        R apply(T t)

        Applies this function to the given argument.

        Parameters: t - the function argument

        Returns: the function result
*/

public class ReferencingInstanceMethodUsingClassName {

    public void operS(Function<String, String> stringOperator, String a) {
        System.out.println(stringOperator.apply(a));
    }

    public static void main(String args[]) {
        ReferencingInstanceMethodUsingClassName ex = new ReferencingInstanceMethodUsingClassName();
        ex.operS(s -> s.toLowerCase(), "STRING");
        ex.operS(String::toLowerCase, "STRING");  // <-- arbitrary object
    }
}
