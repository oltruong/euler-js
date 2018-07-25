"use strict";

function problem() {
    const maxNumber = 100;

    const max = (maxNumber * (maxNumber + 1) / 2);
    const sumSquared = max * max;

    return sumSquared - computeSumOfSquare();

    function computeSumOfSquare() {
      return  [...Array(maxNumber+1).keys()].map(i=>i*i).reduce((a, b) => a + b, 0);
    }
}

module.exports = problem;