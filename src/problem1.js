function problem1() {
    var max = 1000;
    return multipleTotal(3, max) + multipleTotal(5, max) - multipleTotal(15, max);
}

function multipleTotal(multiple, max) {
    var total = 0;
    for (i = 0; i < max / multiple; i++) {
        total += i * multiple;
    }
    return total;
}

module.exports = problem1;