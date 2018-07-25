"use strict";

const fs = require('fs');

function problem() {
    let maxProduct = 0;

    const data = fs.readFileSync(__dirname + '/input/problem11.txt', 'utf8');

    let values = [];

    let rows = data.split("\n");
    for (let i = 0; i < rows.length; i++) {
        values.push(rows[i].split(" "));
    }

    for (let i = 0; i < values.length; i++) {
        for (let j = 0; j < values[0].length; j++) {
            if (j < values[0].length - 4) {
                maxProduct = Math.max(maxProduct, horizontal(values, i, j));
                if (i < values.length - 4) {
                    maxProduct = Math.max(maxProduct, diagonalDown(values, i, j));
                }

                if (i>4){
                    maxProduct = Math.max(maxProduct,diagonalUp(values,i,j));
                }
            }

            if (i < values.length - 4) {
                maxProduct = Math.max(maxProduct, vertical(values, i, j));
            }
        }
    }

    return maxProduct;


    function horizontal(values, i, j) {
        let product = 1;
        for (let a = j; a < j + 4; a++) {
            product *= values[i][a];
        }
        return product;
    }

    function diagonalDown(values, i, j) {
        let product = 1;
        for (let a = 0; a < 4; a++) {
            product *= values[i + a][j + a];
        }
        return product;
    }

    function diagonalUp(values, i, j) {
        let product = 1;
        for (let a = 0; a < 4; a++) {
            product *= values[i - a][j + a];
        }
        return product;
    }

    function vertical(values, i, j) {
        let product = 1;
        for (let a = i; a < i + 4; a++) {
            product *= values[a][j];
        }
        return product;
    }
}


module.exports = problem;