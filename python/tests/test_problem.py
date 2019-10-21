import pytest

from problem1 import get_problem1
from problem2 import get_problem2
from problem3 import get_problem3

test_data = [
    [get_problem1, 233168],
    [get_problem2, 4613732],
    [get_problem3, 6857],
]


@pytest.mark.parametrize("data", test_data)
def test_problems(data):
    assert data[0]() == data[1]
