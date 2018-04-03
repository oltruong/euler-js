"use strict";

const sieve = require(__dirname+"/lib/sieve");

function problem() {
    let total=0;
    let max = 2000000;
    const numbers = sieve(max);
    for (let i=2;i<=max;i++){
        if (numbers[i]!=0){
            total +=i;
        }
    }
    return total;
}

module.exports = problem;