"use strict";

function problem() {
    const base = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"];
    const tenbase = ["twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"];
    const powers = ["", "", "hundred", "thousand"];

    return [...Array(1001).keys()].map(count).reduce((a, b) => a + b, 0);

    function count(value) {
        if (value < 20) {
            return base[value].length;
        } else if (value >= 1000) {
            return printPower(value, 3);
        } else if (value >= 100) {
            return printPower(value, 2);
        } else {
            return tenbase[Math.floor(value / 10) - 2].length + count(value % 10);
        }
    }

    function printPower(value, power) {
        return powers[power].length + count(Math.floor(value / Math.pow(10, power))) + printRemainder(value % Math.pow(10, power));
    }

    function printRemainder(value) {
        return count(value) + (value !== 0 ? 3 : 0);
    }
}

module.exports = problem;