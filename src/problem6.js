"use strict";

function problem() {
    const maxNumber = 100;

    const max = (maxNumber * (maxNumber + 1) / 2);
    const sumSquared = max * max;

    let sumOfSquare = 0;
    for (let i = 1; i <= maxNumber; i++) {
        sumOfSquare += i * i;
    }
    return sumSquared - sumOfSquare;
}

module.exports = problem;