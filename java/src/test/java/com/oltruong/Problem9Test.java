package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem9Test {

    @Test
    void getResult() throws Exception{
        assertEquals(31875000, Problem9.getResult());
    }
}