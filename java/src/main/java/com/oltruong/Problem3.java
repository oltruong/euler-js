package com.oltruong;

class Problem3 {

    private static final long NUMBER_TO_CHECK = 600_851_475_143L;
    private static final boolean[] nonPrimesArray = buildPrimesArray((int) Math.sqrt(NUMBER_TO_CHECK));


    static long getResult() {

        final int squareRoot = (int) Math.sqrt(NUMBER_TO_CHECK);

        for (int number = squareRoot; number >= 2; number--) {
            if (isPrime(number) && isDivisor(number)) {
                return number;
            }
        }

        return NUMBER_TO_CHECK;

    }

    private static boolean isDivisor(int i) {
        return NUMBER_TO_CHECK % i == 0;
    }

    private static boolean isPrime(int number) {
        return !nonPrimesArray[number];
    }

    private static boolean[] buildPrimesArray(int value) {
        boolean[] nonPrimes = new boolean[value + 1];

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
