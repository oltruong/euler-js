"use strict";

const sieve = require(__dirname + "/lib/sieve");

function problem() {
    let total = 0;
    let max = 2000000;
    const numbers = sieve(max);
    return [...Array(max + 1).keys()].filter(i => numbers[i] != 0).reduce((a, b) => a + b, 0);
}

module.exports = problem;