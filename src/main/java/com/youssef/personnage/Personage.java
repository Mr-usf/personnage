package com.youssef.personnage;

public class Personnage {
    private static final String[] ORIENTATIONS = {"NORD", "EST", "SUD", "OUEST"};
    private int i = 0;

    public String getOrientation() {
        return ORIENTATIONS[i];
    }

    public String tourner(int fois) {
        int rotation = fois % 4;

        i = (i + rotation) % 4;
        return ORIENTATIONS[i];
    }
}
