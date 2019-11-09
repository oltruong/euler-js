def get_problem9():
    return find_pythagorean_triplet(1_000)


def find_pythagorean_triplet(sum):
    for a in range(1, 1000):
        for b in range(a + 1, 1000):
            c = 1000 - b - a
            if a * a + b * b == c * c:
                return a * b * c
    raise ValueError(f"Pythagorean triplet with sum {sum}")
