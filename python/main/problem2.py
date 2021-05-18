def get_problem2():
    return sum(number for number in fibonacci_sequence(4000000) if is_even(number))


def fibonacci_sequence(max):
    previous_number = 1
    yield previous_number
    number = 2
    while number < max:
        yield number
        previous_number, number = number, previous_number + number


def is_even(number):
    return number % 2 == 0
