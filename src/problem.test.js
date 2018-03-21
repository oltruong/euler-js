const problem1 = require('./problem1');
const problem2 = require('./problem2');

test('problem1', () => {
    expect(problem1()).toBe(233168);
});

test('problem2', () => {
    expect(problem2()).toBe(4613732);
});
