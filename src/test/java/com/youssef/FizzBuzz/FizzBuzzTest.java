package com.youssef.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzbuzz_de_1_devrait_retourner_1() {
        assertEquals("1", FizzBuzz.de(1));
    }


}