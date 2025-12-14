package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personnage p = new Personnage();
    @Test
    void tourner_3_Depuis_Nord_Donne_Ouest() {

        assertEquals("NORD", p.tourner(4));
    }



}