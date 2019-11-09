def get_problem14():
    return find_max_collatz_sequence(1_000_000)


def find_max_collatz_sequence(max_number):
    max_sequence = 0
    number_with_max_sequence = 0

    sequences = {}

    for n in range(1, max_number + 1):
        sequence = find_collatz_sequence(n, sequences)
        if sequence > max_sequence:
            max_sequence = sequence
            number_with_max_sequence = n

    return number_with_max_sequence


def find_collatz_sequence(n, sequences):
    if n == 1:
        return 1
    elif n in sequences:
        return sequences.get(n)
    else:
        if n % 2 == 0:
            result = 1 + find_collatz_sequence(int(n / 2), sequences)
            sequences[n] = result
        else:
            result = 1 + find_collatz_sequence(3 * n + 1, sequences)
            sequences[n] = result
        return result
