package com.oltruong;

import java.math.BigInteger;
import java.util.Arrays;

class Problem16 {
    static long getResult() {
        BigInteger number = BigInteger.TWO.pow(1000);
        return Arrays.stream(number.toString().split("")).mapToInt(Integer::valueOf).sum();
    }
}