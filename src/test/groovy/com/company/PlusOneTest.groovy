package com.company

import spock.lang.Specification

class PlusOneTest extends Specification {

    private final PlusOne sut = new PlusOne()

    def "should perform plus one"() {
        when:
        int[] result = sut.plusOne(digits)

        then:
        result == expectedResult

        where:
        digits                | expectedResult
        new int[]{1, 2, 3}    | new int[]{1, 2, 4}
        new int[]{4, 3, 2, 1} | new int[]{4, 3, 2, 2}
        new int[]{9}          | new int[]{1, 0}
        new int[]{9, 9}       | new int[]{1, 0, 0}
        new int[]{0}          | new int[]{1}
    }
}
