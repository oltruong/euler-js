from lib.primes_finder import find_primes


def get_problem7():
    return find_prime(10_001)


def find_prime(number):

    primes = find_primes(110_000)
    return primes[number-1]
