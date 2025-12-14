package com.youssef.personnage;

public class Personnage {
    private static final String[] ORIENTATIONS = {
            "NORD", "EST", "SUD", "OUEST"
    };

    private int i = 0;

    public String getOrientation() {
        return ORIENTATIONS[i];
    }

    public String tourner(int fois) {
        i = (i + fois) % 4;
        return ORIENTATIONS[i];
    }

}
