package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personage p = new Personage();
    @Test
    void Initial_Orientation_Est_NORD() {

        assertEquals("NORD", p.getOrientation());
    }


}