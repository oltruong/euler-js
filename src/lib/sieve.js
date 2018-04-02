"use strict";

/**
 *
 * @param max
 * @returns an array of boolean indicating for each index if it is prime or not
 */
function listOfPrimes(max) {

    let primes = Array.from(new Array(max + 1), () => true);

    primes[0] = false;
    primes[1] = false;

    for (let i = 2; i <= max; i++) {
        if (primes[i]) {
            for (let j = 2; j <= max / i; j++) {
                primes[i*j] = false;
            }
        }
    }

    return primes;
}

module.exports = listOfPrimes;