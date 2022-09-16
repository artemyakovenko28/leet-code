package com.company

import spock.lang.Specification

class PowerOfTwoTest extends Specification {

    private final PowerOfTwo sut = new PowerOfTwo()

    def "should check whether number is power of two"() {
        when:
        boolean result = sut.isPowerOfTwo(n)

        then:
        result == expectedResult

        where:
        n  | expectedResult
        1  | true
        16 | true
        3  | false
    }
}
