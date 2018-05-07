"use strict";


function problem() {
    const n = 20;

    let paths = [];
    return findPaths(n, n);

    function findPaths(x, y) {
        let key = (x + "-" + y);
        if (paths[key] !== undefined) {
            return paths[key];
        } else if (x < 1 || y < 1) {
           paths[key] = 1;
            return 1;
        } else {
            paths[key] =findPaths(x, y - 1) + findPaths(y, x - 1);
            return paths[key];
        }
    }
}

module.exports = problem;