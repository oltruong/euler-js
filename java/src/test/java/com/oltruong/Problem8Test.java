package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem8Test {

    @Test
    void getResult() throws Exception{
        assertEquals(23_514_624_000L, Problem8.getResult());
    }
}