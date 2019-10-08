import pytest

from problem1 import get_problem1
from problem2 import get_problem2

test_data = [
    [get_problem1, 233168],
    [get_problem2, 4613732],
]


@pytest.mark.parametrize("data", test_data)
def test_problems(data):
    assert data[0]() == data[1]
