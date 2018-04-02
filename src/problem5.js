"use strict";

function problem() {
    let result = 1;
    for (let i = 2; i <= 20; i++) {
        result = findPPCM(result, i);
    }
    return result;


    function findPPCM(a, b) {
        return a * b / findPGCD(a, b);
    }

    function findPGCD(a, b) {
        if (a > b) {
            const c = b;
            b = a;
            a = c;
        }

        let remainder = b % a;
        while (remainder != 0) {
            b = a;
            a = remainder;
            remainder = b % a;
        }
        return a;
    }
}

module.exports = problem;