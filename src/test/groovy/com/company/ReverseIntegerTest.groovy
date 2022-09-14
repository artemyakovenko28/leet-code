package com.company

import spock.lang.Specification

class ReverseIntegerTest extends Specification {

    private final ReverseInteger reverseInteger = new ReverseInteger()

    def "Reverse"() {
        expect:
        reverseInteger.reverse(x) == result

        where:
        x          | result
        123        | 321
        -123       | -321
        1234567899 | 0
    }
}
