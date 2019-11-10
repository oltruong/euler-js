package com.oltruong;

import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

class Problem13 {
    static long getResult() throws Exception {
        return Long.valueOf(
                Files.lines(Paths.get(Problem13.class.getResource("/problem13.txt").toURI()))
                     .map(BigInteger::new)
                     .reduce(BigInteger.ZERO, BigInteger::add)
                     .toString()
                     .substring(0, 10)
        );
    }
}
