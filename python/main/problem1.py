def get_problem1():
    return sum(number for number in range(1000) if multiple_of_3_or_5(number))


def multiple_of_3_or_5(number):
    return number % 3 == 0 or number % 5 == 0
