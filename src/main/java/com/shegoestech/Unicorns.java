package com.shegoestech;

public class Unicorns {
    private final NumberOperator operator;

    public Unicorns(NumberOperator operator) {
        this.operator = operator;
    }

    public String additionPrinter(int a, int b) {
        int result = operator.add(a, b);

        return result % 2 == 0
                ? "Yeaaah!!, the result is an even number"
                : "Ooops!!! an odd number is here";
    }
}
