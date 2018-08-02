package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem6Test {

    @Test
    void getResult() {
        assertEquals(25164150, Problem6.getResult());
    }
}