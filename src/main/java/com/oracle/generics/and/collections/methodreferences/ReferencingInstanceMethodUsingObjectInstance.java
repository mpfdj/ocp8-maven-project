package com.oracle.generics.and.collections.methodreferences;

import java.util.function.IntBinaryOperator;

/*
        --> IntBinaryOperator <--

        int applyAsInt(int left, int right)

        Applies this operator to the given operands.

        Parameters:
        left - the first operand
        right - the second operand

        Returns: the operator result
*/

public class ReferencingInstanceMethodUsingObjectInstance {

    public int add(int a, int b) {
        return a + b;
    }  // <-- instance method

    public void oper(IntBinaryOperator operator, int a, int b) {
        System.out.println(operator.applyAsInt(a, b));
    }

    public static void main(String args[]) {
        ReferencingInstanceMethodUsingObjectInstance ex = new ReferencingInstanceMethodUsingObjectInstance();
        ex.oper((a, b) -> ex.add(a, b), 1, 2);
        ex.oper(ex::add, 1, 2);
    }

}
