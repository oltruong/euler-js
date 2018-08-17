package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem11Test {

    @Test
    void getResult() throws Exception{
        assertEquals(70_600_674, Problem11.getResult());
    }
}