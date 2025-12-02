package com.youssef.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @BeforeAll
    public static void setUpAll() {
        // Méthode statique exécutée avant tous les tests
        System.out.println("Début des tests Calculator");
    }

    @AfterAll
    public static void tearDownAll() {
        // Méthode statique exécutée après tous les tests
        System.out.println("Fin des tests Calculator");
    }

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(2, -3));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-2, Calculator.divide(6, -3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
    }

}