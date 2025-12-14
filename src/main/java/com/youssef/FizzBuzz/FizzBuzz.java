package com.youssef.FizzBuzz;

public class FizzBuzz {
    public static String de(int nbre) {
        if (nbre % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(nbre);
    }
}
