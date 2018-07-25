"use strict";

function problem2() {
    const MAX = 4000000;

    let total = 0;
    let previous = 1;
    let current = 2;

    while (current < MAX) {
        if (current % 2 == 0) {
            total += current;
        }
        let next = previous + current;
        previous = current;
        current = next;
    }
    return total;
}

module.exports = problem2;