package com.youssef.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzbuzz_de_5_devrait_retourner_Buzz() {
        assertEquals("Buzz", FizzBuzz.de(5));
    }



}