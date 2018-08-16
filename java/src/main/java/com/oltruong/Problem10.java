package com.oltruong;

import com.oltruong.lib.SieveWay;

import java.util.stream.LongStream;

class Problem10 {


    static long getResult() {


        final int MAX_VALUE = 2_000_000;
        final boolean[] nonPrimesArray = SieveWay.buildNonPrimesArray(MAX_VALUE);

        return LongStream.range(0, MAX_VALUE).filter(i -> !nonPrimesArray[(int) i]).sum();

    }


}
