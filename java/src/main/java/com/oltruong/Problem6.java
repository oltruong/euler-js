package com.oltruong;

import java.util.stream.LongStream;

class Problem6 {

    private static final long NUMBER = 100;

    static long getResult() {
        long sumOfNumber = computeSumOfNumber();
        long sumSquared = sumOfNumber * sumOfNumber;

        long sumOfSquares = LongStream.rangeClosed(1, NUMBER).map(n -> n * n).sum();

        return sumSquared - sumOfSquares;
    }

    private static long computeSumOfNumber() {
        return NUMBER * (NUMBER + 1) / 2;
    }

}
