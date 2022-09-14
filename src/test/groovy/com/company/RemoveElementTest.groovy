package com.company

import spock.lang.Specification

class RemoveElementTest extends Specification {

    private final RemoveElement s = new RemoveElement()

    def "removeElement"() {
        expect:
        s.removeElement(nums, val) == length
        println nums

        where:
        nums                              | val | length
        new int[]{3, 2, 2, 3}             | 3   | 2
        new int[]{0, 1, 2, 2, 3, 0, 4, 2} | 2   | 5
        new int[]{3}                      | 3   | 0
        new int[]{}                       | 3   | 0
    }
}
