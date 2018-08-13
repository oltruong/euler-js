package com.oltruong;

class Problem9 {

    static final int EXPECTED_SUM = 1_000;

    static long getResult() {

        for (int a = 1; a < EXPECTED_SUM; a++) {
            for (int b = a; b < EXPECTED_SUM; b++) {
                int c = EXPECTED_SUM - b - a;
                if (c * c == a * a + b * b) {
                    return a * b * c;
                }
            }
        }

        return 0;
    }


}
