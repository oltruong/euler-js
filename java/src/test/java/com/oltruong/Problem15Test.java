package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem15Test {

    @Test
    void getResult() throws Exception{
        assertEquals(137_846_528_820L, Problem15.getResult());
    }
}