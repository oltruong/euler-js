"use strict";

let fs = require('fs');

function problem() {
    let total = 1;

    const data = fs.readFileSync('input/problem8.txt', 'utf8');

    for (let i = 1; i < data.length - 13; i++) {

        let product = 1;
        for (let j = 0; j < 13; j++) {
            product *= data[i + j];
        }

        if (product > total) {
            total = product;
        }
    }

    return total;
}

module.exports = problem;
