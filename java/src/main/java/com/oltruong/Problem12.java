package com.oltruong;

class Problem12 {

    private static final int NUMBER_OF_DIVISORS = 500;

    static int getResult() throws Exception {

        int index = 2;
        int triangleNumber = 1;

        while (numberOfDivisors(triangleNumber) <= NUMBER_OF_DIVISORS) {
            triangleNumber += index;
            index++;
        }

        return triangleNumber;
    }

    private static int numberOfDivisors(int triangleNumber) {
        int numbersOfDivisors = 2;//1 and the number itself

        final double sqrt = Math.sqrt(triangleNumber);
        for (int i = 2; i <= sqrt; i++) {
            if (triangleNumber % i == 0) {
                numbersOfDivisors += 2;
            }
        }
        if (sqrt * sqrt == triangleNumber) {
            numbersOfDivisors--;
        }
        return numbersOfDivisors;
    }


}
