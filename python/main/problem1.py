def get_problem1():
    return sum(
        filter(multiple_of_3_or_5, range(1000))
    )


def multiple_of_3_or_5(number):
    return number % 3 == 0 or number % 5 == 0
