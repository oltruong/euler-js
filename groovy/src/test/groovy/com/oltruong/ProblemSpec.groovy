package com.oltruong

import spock.lang.Specification
import spock.lang.Unroll

class ProblemSpec extends Specification {

    @Unroll
    def "check problem #number - #description "() {
        expect:
        value == expected

        where:
        number || value          || expected  || description
        1      || Problem1.value || 233_168   || "Multiples of 3 and 5"
        2      || Problem2.value || 4_613_732 || "Even Fibonacci numbers"
    }
}
