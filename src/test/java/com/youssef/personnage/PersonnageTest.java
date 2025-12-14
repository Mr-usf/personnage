package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personnage p = new Personnage();
    @Test
    void tourner_cinq_fois_equivaut_a_une_fois() {

        assertEquals("EST", p.tourner(5));
    }
}