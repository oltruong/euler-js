package com.oltruong.lib

class PrimeFinder {

    static List<Boolean> primeFinder(def number) {

        def primes = [true] * (number + 1)
        primes.set(1, false)
        for (i in 2..number / 2) {

            if (primes.get(i)) {
                for (j in 2..number / i) {
                    primes.set(i * j, false)
                }
            }
        }
        primes
    }
}
