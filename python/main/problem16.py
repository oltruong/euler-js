def get_problem16():
    return find_sum_digits(2, 1000)


def find_sum_digits(number, power):
    total = number ** power
    print(total)
    return sum(list(map(int, list(str(total)))))
