from lib.primes_finder import find_primes


def get_problem5():
    return find_smallest_multiple(20)


def find_smallest_multiple(number):
    primes = find_primes(number)

    smallest_multiple = 1

    for prime in primes:
        factor = prime
        max_factor=number/prime
        while factor < max_factor:
            factor *= prime
        smallest_multiple *= factor

    return smallest_multiple


