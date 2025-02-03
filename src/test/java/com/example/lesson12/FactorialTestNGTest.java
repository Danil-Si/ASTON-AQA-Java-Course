package com.example.lesson12;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTestNGTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculate(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(Factorial.calculate(12), 479001600);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialThrowsExceptionForNegative() {
        Factorial.calculate(-1);
    }
}
