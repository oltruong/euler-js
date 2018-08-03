package com.oltruong;

import com.oltruong.lib.SieveWay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Problem7 {

    public static final int PRIME_OCCURENCE_TO_FIND = 10_001;

    static int getResult() {
        return firstWay();
//        return secondWay();
//        return thirdWay();

    }

    private static int firstWay() {
        final boolean[] nonPrimesArray = SieveWay.buildNonPrimesArray(120_000);
        int count = 0;
        for (int i = 2; i < 1_000_000; i++) {
            if (!nonPrimesArray[i]) {
                count++;
            }
            if (count == PRIME_OCCURENCE_TO_FIND) {
                return i;
            }
        }
        return -1;
    }

    private static int secondWay() {
        final boolean[] nonPrimesArray = SieveWay.buildNonPrimesArray(120_000);

        return IntStream.iterate(2, i -> i + 1).filter(i -> !nonPrimesArray[i]).limit(10_001).max().getAsInt();
    }


    private static int thirdWay() {

        List<Integer> primes = new ArrayList<>(PRIME_OCCURENCE_TO_FIND);


        int counter = 0;
        int i = 2;
        while (counter < PRIME_OCCURENCE_TO_FIND) {

            if (isPrime(i,primes)) {
                counter++;
                primes.add(i);
            }
            i++;
        }

        return --i;
    }

    private static boolean isPrime(int number, List<Integer> primes) {
        for (int prime:primes){
            if (number % prime ==0){
                return false;
            }
        }
        return true;
    }


}
