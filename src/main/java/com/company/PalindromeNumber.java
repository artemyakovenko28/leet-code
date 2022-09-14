package com.company;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int[] digits = new int[10];
        byte curr = 0;
        while (x != 0) {
            digits[curr++] = x % 10;
            x /= 10;
        }

        for (int i = 0, j = curr - 1; i < j; i++, j--) {
            if (digits[i] != digits[j]) {
                return false;
            }
        }
        return true;
    }
}
