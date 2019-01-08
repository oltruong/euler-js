package com.oltruong

class Problem2 {

    static def getValue() {

        def total = 2
        def firstNumber = 1
        def secondNumber = 2

        boolean firstEven = false
        boolean secondEven = true
        boolean thirdEven = firstEven == secondEven

        def thirdNumber = firstNumber + secondNumber

        int MAX = 4_000_000
        while (thirdNumber <= MAX) {
            if (thirdEven) {
                total += thirdNumber
            }
            firstNumber = secondNumber
            firstEven = secondEven
            secondNumber = thirdNumber
            secondEven = thirdEven

            thirdEven = firstEven == secondEven
            thirdNumber = firstNumber + secondNumber
        }

        total
    }

}
