from lib.primes_finder import find_primes


def get_problem10():
    return find_sum_primes(2_000_000)


def find_sum_primes(max):
    return sum(find_primes(max))