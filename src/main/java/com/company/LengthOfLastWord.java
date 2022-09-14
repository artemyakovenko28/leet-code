package com.company;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {


    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && length != 0) {
                break;
            } else if (s.charAt(i) == ' ') {
                continue;
            } else {
                length++;
            }
        }
        return length;
    }
}
