package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem13Test {

    @Test
    void getResult() throws Exception{
        assertEquals(5_537_376_230L, Problem13.getResult());
    }
}