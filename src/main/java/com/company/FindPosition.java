package com.company;

import java.util.Arrays;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindPosition {

    public int[] searchRange(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        int[] result = {index, index};

        int leftIndex = index;
        while (leftIndex >= 0) {
            leftIndex = Arrays.binarySearch(nums, 0, leftIndex, target);
            if (leftIndex >= 0) {
                result[0] = leftIndex;
            }
        }

        int rightIndex = index;
        while (rightIndex >= 0) {
            rightIndex = Arrays.binarySearch(nums, rightIndex + 1, nums.length, target);
            if (rightIndex >= 0) {
                result[1] = rightIndex;
            }
        }

        if (result[0] < 0) {
            result[0] = -1;
        }
        if (result[1] < 0) {
            result[1] = -1;
        }
        return result;
    }
}
