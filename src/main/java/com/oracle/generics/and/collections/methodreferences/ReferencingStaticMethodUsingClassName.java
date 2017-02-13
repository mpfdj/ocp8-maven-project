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

public class ReferencingStaticMethodUsingClassName {

    public static int mul(int a, int b) {
        return a * b;
    }  // <-- static method

    public void oper(IntBinaryOperator operator, int a, int b) {
        System.out.println(operator.applyAsInt(a, b));
    }

    public static void main(String args[]) {
        ReferencingStaticMethodUsingClassName ex = new ReferencingStaticMethodUsingClassName();
        ex.oper((a, b) -> ReferencingStaticMethodUsingClassName.mul(a, b), 1, 2);
        ex.oper(ReferencingStaticMethodUsingClassName::mul, 1, 2);
    }

}