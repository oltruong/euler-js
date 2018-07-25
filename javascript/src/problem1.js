"use strict";

function problem1() {
    let max = 1000;
    return multipleTotal(3, max) + multipleTotal(5, max) - multipleTotal(15, max);
}

function multipleTotal(multiple, max) {
    return [...Array(Math.ceil(max / multiple)).keys()].map(i => i * multiple).reduce((a, b) => a + b, 0);
}

module.exports = problem1;