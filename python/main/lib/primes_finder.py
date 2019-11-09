
def find_primes(max_number):
    primes = [True for _ in range(0, max_number + 1)]
    for i in range(2, max_number + 1):
        if primes[i]:
            j = 2 * i
            while j <= max_number:
                primes[j] = False
                j += i
    return [i for i in range(2, len(primes)) if primes[i]]


def find_prime_decomposition(number):
    primes = find_primes(number)
    results = []
    for prime in primes:
        factor = 0
        temp = number
        while temp % prime == 0:
            temp /= prime
            factor += 1
        if factor:
            results.append([prime, factor])
    return results
