package com.company;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    private static final Set<Character> alphabet = Stream.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
            .collect(Collectors.toSet());

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (alphabet.contains(ch)) {
                builder.append(ch);
            }
        }
        String result = builder.toString();

        for (int i = 0, j = result.length() - 1; i < result.length() / 2; i++, j--) {
            if (result.charAt(i) != result.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
