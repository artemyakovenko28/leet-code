package com.company

import spock.lang.Specification

class FindPositionTest extends Specification {

    private final FindPosition s = new FindPosition()

    def "searchRange"() {
        expect:
        int[] actual = s.searchRange(nums, target)
        actual == result

        where:
        nums                                     | target | result
        new int[]{5, 7, 7, 8, 8, 10}             | 8      | new int[]{3, 4}
        new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 10} | 8      | new int[]{3, 8}
        new int[]{5, 7, 7, 8, 8, 10}             | 6      | new int[]{-1, -1}
    }
}
