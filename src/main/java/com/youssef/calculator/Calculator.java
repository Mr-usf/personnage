package com.youssef.calculator;

public class Calculator {

        // Addition
        public int add(int opG, int opD) {
            final int i = opG + opD;
            return i;
        }

        // Division
        public int divide(int opG, int opD) {
            if (opD == 0) {
                throw new IllegalArgumentException("Division par zéro interdite");
            }
            return opG / opD;
        }

}
