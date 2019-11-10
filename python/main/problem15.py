def get_problem15():
    return find_all_lattice_paths(20)


def find_all_lattice_paths(size):
    known_paths = dict()
    return find_lattice_paths(size, size, known_paths)


def find_lattice_paths(x, y, known_paths):
    key = f"{x}-{y}"
    if key in known_paths:
        return known_paths[key]
    elif y == 0 or x == 0:
        return 1
    else:
        result = find_lattice_paths(x, y - 1, known_paths) + find_lattice_paths(x - 1, y, known_paths)
        known_paths[key] = result
        return result
