"use strict";
const sieve = require(__dirname+"/lib/sieve");

function problem() {

    const primeNumbersToFind=10001;
    let numbers = sieve(200000);

    let total = 0;
    for (let i = 2; i < 1000000; i++) {
        if (numbers[i]) {
            total++;
        }
        if (total==primeNumbersToFind){
            return i;
        }
    }


    return Nan;

}

module.exports = problem;