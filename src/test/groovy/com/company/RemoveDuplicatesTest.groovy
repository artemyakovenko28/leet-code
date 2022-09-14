package com.company

import spock.lang.Specification

class RemoveDuplicatesTest extends Specification {

    private final RemoveDuplicates s = new RemoveDuplicates()

    def "removeDuplicates"() {
        expect:
        s.removeDuplicates(input) == length
        println input

        where:
        input                                   | result          | length
        new int[]{1, 1, 2}                      | new int[]{1, 2} | 2
        new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4} | new int[]{1, 2} | 5
    }
}
