package com.company

import spock.lang.Specification

class FibonacciNumberTest extends Specification {

    private final FibonacciNumber sut = new FibonacciNumber()

    def "should calculate fibonacci number"() {
        when:
        int result = sut.fib(n)

        then:
        result == expectedResult

        where:
        n | expectedResult
        2 | 1
        3 | 2
        4 | 3
    }
}
