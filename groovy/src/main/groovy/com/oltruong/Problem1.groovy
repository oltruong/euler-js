package com.oltruong

class Problem1 {
    static def getValue() {
        (0..999)
                .findAll { multipleOf3or5(it) }
                .sum()
    }

    private static boolean multipleOf3or5(int it) {
        it % 3 == 0 || it % 5 == 0
    }
}
