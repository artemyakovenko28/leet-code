package com.company

import spock.lang.Specification

class PalindromeNumberTest extends Specification {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber()

    def "IsPalindrome"() {
        expect:
        palindromeNumber.isPalindrome(number) == result

        where:
        number | result
        123321 | true
        -123   | false
        0      | true
        22     | true
        232    | true
        1122   | false
        123123 | false
    }
}
