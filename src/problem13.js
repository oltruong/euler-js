"use strict";
const fs = require('fs');
const bigInt = require("big-integer");

function problem() {

    const data = fs.readFileSync(__dirname + '/input/problem13.txt', 'utf8');
    let rows = data.split("\n");
    let total = [...Array(rows.length).keys()].map(i => bigInt(rows[i])).reduce((a, b) => a.plus(b), bigInt(0));
    return parseInt(total.toString().substring(0,10));
}

module.exports = problem;


problem();