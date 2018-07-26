package com.oltruong;

import java.util.stream.IntStream;

class Problem1 {
    static int getResult() {
        return IntStream.rangeClosed(1, 1000 / 3).map(i -> i * 3).sum() + IntStream.range(1, 1000 / 5).map(i -> i * 5).sum() - IntStream.rangeClosed(1, 1000 / 15).map(i -> i * 15).sum();
    }
}
