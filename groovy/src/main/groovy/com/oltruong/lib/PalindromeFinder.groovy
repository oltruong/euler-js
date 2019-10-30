package com.oltruong.lib

class PalindromeFinder {

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
