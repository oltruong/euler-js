package com.oltruong

import spock.lang.Specification

class ProblemSpec extends Specification {

    def "check"() {
        expect:
        Problem1.value == 233_168
    }
}
