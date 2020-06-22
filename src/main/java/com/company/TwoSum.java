package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsWithIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            Integer secondIndex = numsWithIndex.get(second);
            if (secondIndex != null) {
                return new int[]{i, secondIndex};
            }
            numsWithIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("no element that give target in sum");
    }
}
