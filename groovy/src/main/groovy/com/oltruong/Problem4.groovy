package com.oltruong

import com.oltruong.lib.PalindromeFinder

class Problem4 {

    static def getValue() {
        largestPalindrome()
    }

    static def largestPalindrome() {

        int maxPalindrome = -1

        for (i in 999..100) {
            for (j in i..100) {
                int product = i * j
                if (PalindromeFinder.isPalindrome(product)) {
                    maxPalindrome = Math.max(maxPalindrome, product)
                }
            }
        }
        maxPalindrome
    }


}
