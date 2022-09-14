package com.company;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        int reversedNum = 0;
        while (x > 0) {
            int prevNum = reversedNum;
            reversedNum = reversedNum * 10 + x % 10;
            if (reversedNum / 10 != prevNum) {
                return 0;
            }
            x /= 10;
        }
        return isNegative ? -reversedNum : reversedNum;
    }
}
