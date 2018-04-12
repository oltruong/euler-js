"use strict";
const fs = require('fs');

function problem() {
    let total=0;

    const data = fs.readFileSync(__dirname + '/input/problem13.txt', 'utf8');
    let rows = data.split("\n");
    for (let i = 0; i < rows.length; i++) {
        total +=parseInt(rows[i]);
    }
    return Math.floor(total/Math.pow(10,42));
}

module.exports = problem;