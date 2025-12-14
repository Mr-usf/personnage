package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personnage p = new Personnage();
    @Test
    void tournerUneFoisDepuisNordRetourneEst() {

        assertEquals("EST", p.tourner(1));
    }


}