package com.oltruong;

import java.util.HashMap;
import java.util.Map;

class Problem15 {

    static long getResult() throws Exception {
        return findLatticePaths(20, 20, new HashMap<>());
    }

    private static long findLatticePaths(long x, long y, Map<String, Long> knownPaths) {
        final String key = x + "-" + y;
        if (x == 0 || y == 0) {
            return 1;
        } else if (knownPaths.containsKey(key)) {
            return knownPaths.get(key);
        } else {
            long result = findLatticePaths(x - 1, y, knownPaths) + findLatticePaths(x, y - 1, knownPaths);
            knownPaths.put(key, result);
            return result;
        }
    }
}