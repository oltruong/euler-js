package com.oltruong.lib;

public final class SieveWay {

    private SieveWay() {
        //Utility class
    }

    public static boolean[] buildNonPrimesArray(int value) {
        boolean[] nonPrimes = new boolean[value + 1];
        nonPrimes[0] = true;
        nonPrimes[1] = true;
        int index = 2;
        while (index <= value) {
            if (!nonPrimes[index]) {
                for (int i = 2; i <= value / index; i++) {
                    nonPrimes[index * i] = true;
                }
            }
            index++;
        }
        return nonPrimes;
    }
}