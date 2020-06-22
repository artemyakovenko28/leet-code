package com.company

import spock.lang.Specification

class ValidParenthesesTest extends Specification {

    private final ValidParentheses validParentheses = new ValidParentheses()

    def "IsValid"() {
        expect:
        validParentheses.isValid(input) == result

        where:
        input    | result
        "()"     | true
        "()[]{}" | true
        "(]"     | false
        "([)]"   | false
        "{[]}"   | true
        "["      | false
        "(("     | false
        "]"      | false
    }
}
