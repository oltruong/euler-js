package com.oltruong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(TimingExtension.class)
class Problem3Test {

    @Test
    void getResult() {
        assertEquals(6857L, Problem3.getResult());
    }
}