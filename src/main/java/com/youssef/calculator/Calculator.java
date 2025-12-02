package com.youssef.calculator;

public class Calculator {
    // Addition
    public static int add(int opG, int opD){
        return opG + opD;
    }

    // Division
    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new IllegalArgumentException("Division par zéro interdite");
        }
        return opG / opD;
    }

}
