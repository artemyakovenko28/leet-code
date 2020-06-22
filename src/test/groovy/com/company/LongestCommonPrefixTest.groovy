package com.company

import spock.lang.Specification

class LongestCommonPrefixTest extends Specification {

    private final LongestCommonPrefix p = new LongestCommonPrefix()

    def "LongestCommonPrefix"() {
        expect:
        p.longestCommonPrefix(input) == result

        where:
        input                                    | result
        new String[]{"flower", "flow", "flight"} | "fl"
        new String[]{"dog", "racecar", "car"}    | ""
    }
}
