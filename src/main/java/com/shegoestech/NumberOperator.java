package com.shegoestech;

public class NumberOperator {

    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public boolean isNegative(int a) {
        return a < 0;
    }
}
