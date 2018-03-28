const problem1 = require('./problem1');
const problem2 = require('./problem2');
const problem3 = require('./problem3');
const problem4 = require('./problem4');

test('problem1', () => {
    expect(problem1()).toBe(233168);
});

test('problem2', () => {
    expect(problem2()).toBe(4613732);
});

test('problem3', () => {
    expect(problem3()).toBe(6857);
});

test('problem4', () => {
    expect(problem4()).toBe(906609);
});
