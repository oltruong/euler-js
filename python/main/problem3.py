from math import sqrt

from lib.primes_finder import find_primes


def get_problem3():
    number = 600851475143
    return largest_prime_factor(number)


def largest_prime_factor(number):
    primes = find_primes(int(sqrt(number)))[::-1]

    for i in primes:
        if number % i == 0:
            return i

    return number


def is_not_divider(candidate, number):
    return number % candidate != 0


def is_not_prime(candidate):
    return first_divider(candidate) != 1


def first_divider(candidate):
    number = int(sqrt(candidate))
    while candidate % number != 0:
        number -= 1

    return number
