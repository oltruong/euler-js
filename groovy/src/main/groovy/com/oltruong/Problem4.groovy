package com.oltruong

class Problem4 {

    public static void main(String[] args) {
        println(123 % 10)
        println((int) (123/10) % 10)
    }

    static def getValue() {
        largestPalindrome()
    }

    static Object largestPalindrome() {

        int maxPalindrome = -1

        for (i in 999..100) {
            for (j in i..100) {
                int product = i * j
                if (isPalindrome(product)) {
                    maxPalindrome = Math.max(maxPalindrome, product)
                }
            }
        }
        maxPalindrome
    }

    static boolean isPalindrome(int number) {

        def digits=[]

        while (number>0){
            digits.add(number % 10)
            number = (int) number/10
        }

        boolean palindrome=true

        int numberOfDigits=digits.size()
        for (int i=0; i< numberOfDigits /2 && palindrome; i++){
            palindrome=digits.get(i)==digits.get(numberOfDigits -i-1)
        }
        palindrome
    }
}
