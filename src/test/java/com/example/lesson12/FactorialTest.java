package com.example.lesson12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(479001600, Factorial.calculate(12));
    }

    @Test
    void testFactorialThrowsExceptionForNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculate(-1));
    }
}
