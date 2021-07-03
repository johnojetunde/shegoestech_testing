package com.shegoestech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnicornIntTest {
    private NumberOperator numberOperator;
    private Unicorns unicorns;

    @BeforeEach
    void setUp() {
        numberOperator =  new NumberOperator();
        unicorns = new Unicorns(numberOperator);
    }

    @Test
    void whenNumberResultIsExpectedToBeEven() {
        String message = unicorns.additionPrinter(3, 1);
        assertEquals(
                "Yeaaah!!, the result is an even number",
                message);
    }

    @Test
    void whenNumberResultIsExpectedToBeOdd() {
        String message = unicorns.additionPrinter(1, 2);
        assertEquals(
                "Ooops!!! an odd number is here",
                message);
    }
}
