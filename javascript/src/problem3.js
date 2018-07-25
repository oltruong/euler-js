"use strict";

const sieve = require(__dirname+"/lib/sieve");

function problem() {
    const numberToCheck = 600851475143;
    let number = Math.round(Math.sqrt(numberToCheck));
    let numbers = sieve(number);

    while (number > 0) {
        if (numbers[number] && numberToCheck % number == 0) {
            return number;
        }
        number--;
    }
    return -1;
}

module.exports = problem;