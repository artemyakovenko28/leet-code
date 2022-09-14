package com.company

import spock.lang.Specification

class LongestSubstringTest extends Specification {

    private final LongestSubstring s = new LongestSubstring()

    def "lengthOfLongestSubstring"() {
        expect:
        s.lengthOfLongestSubstring(input) == result

        where:
        input      | result
        "abcabcbb" | 3
        "bbbbb"    | 1
        "pwwkew"   | 3
    }
}
