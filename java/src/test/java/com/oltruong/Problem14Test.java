package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem14Test {

    @Test
    void getResult() throws Exception{
        assertEquals(837_799, Problem14.getResult());
    }
}