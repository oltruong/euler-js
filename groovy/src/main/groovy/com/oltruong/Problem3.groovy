package com.oltruong

class Problem3 {

    static def getValue() {
        largestPrimeFactor(600_851_475_143)
    }

    static Object largestPrimeFactor(long number) {

        int squareNumber = Math.sqrt(number)

        def primes = [true] * (squareNumber + 1)
        primes.set(1, false)
        for (i in 2..squareNumber/2) {

            if (primes.get(i)) {
                for (j in 2..squareNumber/i) {

                    if (i*j > squareNumber){
                        println("alert")
                    }
                    primes.set(i * j, false)
                }
            }
        }

        for (possiblePrime in squareNumber..2){
            if (primes.get(possiblePrime) && number % possiblePrime==0 ){
                return possiblePrime
            }
        }
        number
    }
}
