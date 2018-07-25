"use strict";

function problem() {
    let collatz = [];

    let maxSuite = 1;
    let result = 1;

    let cursor = 1;

    while (cursor < 1000000) {
        let suite = findCollatz(cursor);
        if (suite > maxSuite) {
            maxSuite = suite;
            result = cursor;
        }
        cursor++;
    }

    function findCollatz(cursor) {
        if (collatz[cursor] !== undefined) {
            return collatz[cursor];
        } else if (cursor === 1) {
            return 1;
        } else {
            let next = cursor % 2 == 0 ? cursor / 2 : 3 * cursor + 1;
            let result = 1 + findCollatz(next);
            collatz[cursor] = result;
            return result;
        }
    }
    return result;
}

module.exports = problem;