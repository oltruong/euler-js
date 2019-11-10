package com.oltruong;

import java.util.HashMap;
import java.util.Map;

class Problem14 {

    static int getResult() throws Exception {
        int solution = 1;
        long currentRecord = 1;
        Map<Long, Long> collatzMap = new HashMap<>();
        for (int i = 2; i < 1_000_000; i++) {
            long collatzLength = collatz(i, collatzMap);
            if (collatzLength > currentRecord) {
                currentRecord = collatzLength;
                solution = i;
            }
        }
        return solution;
    }

    private static long collatz(long i, Map<Long, Long> map) {
        if (i == 1) {
            return 1;
        } else if (map.containsKey(i)) {
            return map.get(i);
        } else if (i % 2 == 0) {
            long result = 1 + collatz(i / 2, map);
            map.put(i, result);
            return result;
        } else {
            long result = 1 + collatz(3 * i + 1, map);
            map.put(i, result);
            return result;
        }
    }
}
