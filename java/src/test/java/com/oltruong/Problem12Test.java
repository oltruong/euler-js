package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem12Test {

    @Test
    void getResult() throws Exception{
        assertEquals(76_576_500, Problem12.getResult());
    }
}