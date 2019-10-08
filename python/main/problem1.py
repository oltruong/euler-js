from functools import reduce


def get_problem1():
    return reduce(
        sum,
        filter(multiple_of_3_or_5, range(1000))
    )


def sum(a, b):
    return a + b


def multiple_of_3_or_5(i):
    return i % 3 == 0 or i % 5 == 0
