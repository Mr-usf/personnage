package com.youssef.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(6, -3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

}