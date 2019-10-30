package com.oltruong

import com.oltruong.lib.PrimeFinder

class Problem3 {

    static def getValue() {
        largestPrimeFactor(600_851_475_143)
    }

    static def largestPrimeFactor(long number) {
        List<Boolean> primes= PrimeFinder.primeFinder(number)

        for (possiblePrime in  (int) Math.sqrt(number)..2){
            if (primes.get(possiblePrime) && number % possiblePrime==0 ){
                return possiblePrime
            }
        }
        number
    }

}
