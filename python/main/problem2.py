def get_problem2():
    sum_of_even_valued_terms = 2

    first_term, second_term = 1, 2
    new_term = first_term+second_term

    while new_term < 4000000:
        if new_term % 2 == 0:
            sum_of_even_valued_terms += new_term
        first_term, second_term = second_term, new_term
        new_term = first_term + second_term

    return sum_of_even_valued_terms
