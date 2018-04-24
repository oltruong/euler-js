"use strict";
const fs = require('fs');

function problem() {

    const data = fs.readFileSync(__dirname + '/input/problem13.txt', 'utf8');
    let rows = data.split("\n");
    let total = [...Array(rows.length).keys()].map(i => parseInt(rows[i])).reduce((a, b) => a + b, 0);
    return Math.floor(total / Math.pow(10, 42));
}

module.exports = problem;