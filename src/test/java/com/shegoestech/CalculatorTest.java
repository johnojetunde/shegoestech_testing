package com.shegoestech;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final NumberOperator numberOperator = new NumberOperator();

    @Test
    void addTwoNumbers_with1And2() {
        int expectedResult = 3;
        int result = numberOperator.add(1, 2);

        assertEquals(expectedResult, result);
    }

    @Test
    void addTwoNumbers_with8And3() {
        int expectedResult = 11;
        int result = numberOperator.add(8, 3);

        assertEquals(expectedResult, result);
    }

    @Test
    void isNumberNegative_isFalse() {
        boolean result = numberOperator.isNegative(1);
        assertFalse(result);
    }

    @Test
    void isNumberNegative_true() {
        boolean result = numberOperator.isNegative(-1);
        assertTrue(result);
    }
}