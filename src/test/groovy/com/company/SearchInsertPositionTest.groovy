package com.company

import spock.lang.Specification

class SearchInsertPositionTest extends Specification {

    private final SearchInsertPosition s = new SearchInsertPosition()

    def "searchInsert"() {
        expect:
        s.searchInsert(nums, target) == position

        where:
        nums                  | target | position
        new int[]{1, 3, 5, 6} | 5      | 2
        new int[]{1, 3, 5, 6} | 2      | 1
        new int[]{1, 3, 5, 6} | 7      | 4
        new int[]{1, 3, 5, 6} | 0      | 0
    }
}
