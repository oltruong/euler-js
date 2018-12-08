package com.oltruong

class Problem1 {

    static def getValue() {
        int result = 0

        for (i in 0..999) {
            if (i % 5 == 0 || i % 3 == 0) {
                result += i
            }
        }
        result
    }
}
