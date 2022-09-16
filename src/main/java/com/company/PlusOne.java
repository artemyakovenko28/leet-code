package com.company;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean change = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (!change) {
                break;
            } else {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    if (i == 0) {
                        int[] newDigits = new int[digits.length + 1];
                        System.arraycopy(digits, 0, newDigits, 1, digits.length);
                        newDigits[0] = 1;
                        digits = newDigits;
                    }
                } else {
                    digits[i] += 1;
                    change = false;
                }
            }
        }
        return digits;
    }
}
