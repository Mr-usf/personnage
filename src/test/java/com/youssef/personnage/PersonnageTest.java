package com.youssef.personnage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonnageTest {

    Personnage p = new Personnage();
    @Test
    void appels_successifs_conservent_l_orientation() {
        p.tourner(1); // EST
        assertEquals("SUD", p.tourner(1));
    }

}