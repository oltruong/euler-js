package com.oltruong

import com.oltruong.lib.PrimeFinder

class Problem3 {

    static def getValue() {
        largestPrimeFactor(600_851_475_143)
    }

    static def largestPrimeFactor(long number) {
        int sqrtNumber = (int) Math.sqrt(number)
        List<Boolean> primes = PrimeFinder.primeFinder(sqrtNumber)

        for (possiblePrime in sqrtNumber..2) {
            if (primes.get(possiblePrime) && number % possiblePrime == 0) {
                return possiblePrime
            }
        }
        number
    }

}
