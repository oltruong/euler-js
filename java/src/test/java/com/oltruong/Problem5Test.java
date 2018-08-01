package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem5Test {

    @Test
    void getResult() {
        assertEquals(232792560, Problem5.getResult());
    }
}