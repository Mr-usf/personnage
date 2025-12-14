package com.youssef.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzbuzz_de_3_devrait_retourner_Fizz() {
        assertEquals("Fizz", FizzBuzz.de(3));
    }
}