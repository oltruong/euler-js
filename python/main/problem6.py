def get_problem6():
    return find_difference_sum_squares_square_sum(100)


def find_difference_sum_squares_square_sum(number):
    return (number * (number + 1) / 2) * (number * (number + 1) / 2) - sum([i * i for i in range(1, number + 1)])
