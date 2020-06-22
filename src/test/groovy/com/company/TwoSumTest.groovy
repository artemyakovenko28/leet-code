package com.company

import spock.lang.Specification

class TwoSumTest extends Specification {

    private final TwoSum twoSum = new TwoSum()

    def "TwoSum"() {
        expect:
        twoSum.twoSum(nums, target) == result

        where:
        nums                    | target | result
        new int[]{2, 7, 11, 15} | 9      | new int[]{1, 0}
        new int[]{3, 3}         | 6      | new int[]{1, 0}
    }
}
