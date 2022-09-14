package com.company

import spock.lang.Specification

class ValidPalindromeTest extends Specification {

    private final ValidPalindrome sut = new ValidPalindrome()

    def "IsPalindrome"() {
        expect:
        boolean result = sut.isPalindrome(s)
        result == expected

        where:
        s                                | expected
        'A man, a plan, a canal: Panama' | true
        'race a car'                     | false
        ' '                              | true
        '0P'                             | false
    }
}
