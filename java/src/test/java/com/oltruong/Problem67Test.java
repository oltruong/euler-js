package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem67Test {
    @Test
    void getResult() throws Exception{
        assertEquals(7_273, Problem67.getResult());
    }
}