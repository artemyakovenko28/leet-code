package com.company;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> chars = new HashSet<>();
            int substringLength = 0;
            for (int j = i; j < s.length(); j++) {
                if (chars.contains(s.charAt(j))) {
                    break;
                }
                chars.add(s.charAt(j));
                substringLength++;
            }
            if (substringLength > maxSubstringLength) {
                maxSubstringLength = substringLength;
            }
        }
        return maxSubstringLength;
    }
}
