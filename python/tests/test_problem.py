import pytest

from problem1 import get_problem1
from problem2 import get_problem2
from problem3 import get_problem3
from problem4 import get_problem4
from problem5 import get_problem5
from problem6 import get_problem6
from problem7 import get_problem7
from problem8 import get_problem8
from problem9 import get_problem9
from problem10 import get_problem10

test_data = [
    [get_problem1, 233_168],
    [get_problem2, 4_613_732],
    [get_problem3, 6_857],
    [get_problem4, 906_609],
    [get_problem5, 232_792_560],
    [get_problem6, 25_164_150],
    [get_problem7, 104_743],
    [get_problem8, 23_514_624_000],
    [get_problem9, 31_875_000],
    [get_problem10, 142_913_828_922],
]


@pytest.mark.parametrize("data", test_data)
def test_problems(data):
    assert data[0]() == data[1]
