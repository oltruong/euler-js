package com.oltruong;

class Problem2 {
    static int getResult() {
        int f0 = 1;
        int f1 = 2;

        int sum = 0;
        final int max = 4_000_000;
        while (f1 <= max) {
            if (f1 % 2 == 0) {
                sum += f1;
            }
            int temp = f1;
            f1 += f0;
            f0 = temp;
        }
        return sum;
    }
}
