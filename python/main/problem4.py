def get_problem4():
    return find_largest_palindrome_from_product_of_2_3digits_number()


def find_largest_palindrome_from_product_of_2_3digits_number():
    max_palindrome = 0
    for i in range(100, 1000):
        for j in range(i, 1000):
            product = i * j
            if product > max_palindrome and is_palindrome(product):
                max_palindrome = product

    return max_palindrome


def is_palindrome(product):
    return str(product) == str(product)[::-1]
