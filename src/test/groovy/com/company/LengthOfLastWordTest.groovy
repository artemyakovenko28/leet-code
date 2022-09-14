package com.company

import spock.lang.Specification

class LengthOfLastWordTest extends Specification {

    private final LengthOfLastWord sut = new LengthOfLastWord()

    def "LengthOfLastWord"() {
        expect:
        int length = sut.lengthOfLastWord(s)
        length == expectedLength

        where:
        s                             | expectedLength
        'Hello World'                 | 5
        '   fly me   to   the moon  ' | 4
        'luffy is still joyboy'       | 6
    }
}
