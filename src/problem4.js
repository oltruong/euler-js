"use strict";

function problem() {
    let max = 0;

    for (let i = 100; i < 1000; i++) {
        for (let j = i; j < 1000; j++) {
            let product = i * j;
            if (isPalindromic(product) && product > max) {
                max = product;
            }
        }
    }
    return max;
}

function isPalindromic(number){
    return number.toString().split("").reverse().join("") == number;
}

module.exports = problem;