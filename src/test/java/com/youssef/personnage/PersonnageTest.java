package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personnage p = new Personnage();
    @Test
    void tourner_zero_fois_retourne_nord() {

        assertEquals("NORD", p.tourner(0));
    }




}