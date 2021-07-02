package com.shegoestech;

public class NumberOperator {

    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public boolean isNegative(int a) {
        return a < 0;
    }

    public double divide(double v, double v1) {
        if (v1 == 0) {
            throw new IllegalArgumentException("Division by zero is not supported");
        }

        return v / v1;
    }
}
