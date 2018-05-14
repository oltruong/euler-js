"use strict";
const fs = require('fs');

function problem() {
    const data = fs.readFileSync(__dirname + '/input/problem67.txt', 'utf8');

    let values = [];

    let rows = data.split("\n");
    for (let i = 0; i < rows.length; i++) {
        values.push(rows[i].split(" "));
    }

    let maxPaths = [];
    maxPaths[values.length - 1] = values[values.length - 1];

    for (let i = values.length - 2; i >= 0; i--) {
        maxPaths[i] = [];
        for (let j = 0; j < values[i].length; j++) {
            maxPaths[i][j] = parseInt(values[i][j]) + Math.max(maxPaths[i + 1][j], maxPaths[i + 1][j + 1]);
        }
    }

    return maxPaths[0][0];
}

module.exports = problem;