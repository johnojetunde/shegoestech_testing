package com.shegoestech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOperatorTest {

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

    @Test
    void division_anyNumberBy1_using4() {
        double result = numberOperator.divide(4.0, 1.0);

        assertEquals(4.0, result);
    }

    @Test
    void division_anyNumberBy1_using5() {
        double result = numberOperator.divide(5.0, 1.0);
        assertEquals(5.0, result);
    }

    @Test
    void division_byZeroShouldThrowAnException() {
        assertThrows(IllegalArgumentException.class,
                () -> numberOperator.divide(10, 0));
    }

    @Test
    void division_byZeroShouldThrowAnException_withTryAndCatch() {
        try {
            numberOperator.divide(10, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero is not supported", e.getMessage());
        }
    }
}