package com.oltruong.lib

class PrimeFinder {

    static List<Boolean> primeFinder(def number) {
        int squareNumber = Math.sqrt(number)

        def primes = [true] * (squareNumber + 1)
        primes.set(1, false)
        for (i in 2..squareNumber / 2) {

            if (primes.get(i)) {
                for (j in 2..squareNumber / i) {
                    primes.set(i * j, false)
                }
            }
        }
        primes
    }
}
