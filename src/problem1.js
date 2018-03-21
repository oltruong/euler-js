"use strict";

function problem1() {
    let max = 1000;
    return multipleTotal(3, max) + multipleTotal(5, max) - multipleTotal(15, max);
}

function multipleTotal(multiple, max) {
    let total = 0;
    for (let i = 0; i < max / multiple; i++) {
        total += i * multiple;
    }
    return total;
}

module.exports = problem1;