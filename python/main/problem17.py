def get_problem17():
    return find_sum_letter(1000)


numbers = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
           "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
dozens = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
powers = ["", "", "hundred", "thousand"]


def to_letter(number):
    power_length = len(powers)
    for power in reversed(range(2, power_length)):
        tenth = 10 ** power
        if number >= tenth:
            remainder = number % tenth
            division = int(number / tenth)
            if remainder:
                return numbers[division] + " " + powers[power] + " and " + to_letter(remainder)
            else:
                return numbers[division] + " " + powers[power]

    if number > len(numbers) - 1:
        remainder = number % 10
        division = int(number / 10)
        if remainder:
            return dozens[division] + "-" + numbers[remainder]
        else:
            return dozens[division]
    else:
        return numbers[number]


def letter_sum(number):
    return len(to_letter(number).replace(" ", "").replace("-", ""))


def find_sum_letter(number):
    return sum([letter_sum(number) for number in range(1, number + 1)])
