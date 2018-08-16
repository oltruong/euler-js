package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem10Test {

    @Test
    void getResult() throws Exception{
        assertEquals(142_913_828_922L, Problem10.getResult());
    }
}