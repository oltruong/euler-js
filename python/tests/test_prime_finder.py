import pytest

from lib.primes_finder import find_primes
from lib.primes_finder import find_prime_decomposition

primes = [
    [2, [2]],
    [10, [2, 3, 5, 7]],
]

prime_decomposition = [
    [2, [[2,1]]],
    [10, [[2,1],[5,1]]],
    [28, [[2,2],[7,1]]],
    [32640, [[2, 7], [3, 1], [5, 1], [17, 1]]],
]


@pytest.mark.parametrize("data", primes)
def test_find_primes(data):
    assert find_primes(data[0]) == data[1]


@pytest.mark.parametrize("data", prime_decomposition)
def test_find_prime_decomposition(data):
    assert find_prime_decomposition(data[0]) == data[1]
