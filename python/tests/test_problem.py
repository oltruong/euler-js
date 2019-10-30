import pytest

from problem1 import get_problem1
from problem2 import get_problem2
from problem3 import get_problem3
from problem4 import get_problem4
from problem5 import get_problem5
from problem6 import get_problem6

test_data = [
    [get_problem1, 233168],
    [get_problem2, 4613732],
    [get_problem3, 6857],
    [get_problem4, 906609],
    [get_problem5, 232_792_560],
    [get_problem6, 25_164_150],
]


@pytest.mark.parametrize("data", test_data)
def test_problems(data):
    assert data[0]() == data[1]
