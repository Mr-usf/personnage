package com.youssef.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzbuzz_de_15_devrait_retourner_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }
}