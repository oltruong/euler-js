"use strict";
const bigInt = require("big-integer");

function problem() {
   return bigInt(2).pow(1000).toString().split('')
        .map(Number)
       .reduce((a, b) => a + b, 0);
}

module.exports = problem;