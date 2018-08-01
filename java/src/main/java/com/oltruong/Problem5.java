package com.oltruong;

class Problem5 {

    private static final int NUMBER = 20;

    static long getResult() {
        long result = 1;
        for (long i = 2; i <= NUMBER; i++) {
            result = findPPCM(result, i);
        }

        return result;
    }

    private static long findPPCM(long a, long b) {
        return a * b / findPGCD(a, b);
    }

    private static long findPGCD(long a, long b) {
        if (a > b) {
            return findPGCD(b, a);
        } else {
            long remainder = b % a;
            if (remainder == 0) {
                return a;
            } else {
                return findPGCD(remainder, a);
            }
        }

    }
}
