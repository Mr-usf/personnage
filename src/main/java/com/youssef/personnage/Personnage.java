package com.youssef.personnage;

public class Personnage {
    private static String ORIENTATIONS = "NORD";



    public String tourner(int fois) {
        if (fois == 1) {
            ORIENTATIONS = "EST";
        }
        return ORIENTATIONS;
    }

}
