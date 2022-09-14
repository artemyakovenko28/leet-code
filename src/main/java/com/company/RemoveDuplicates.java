package com.company;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int pos = 1;
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num) {
                nums[pos++] = nums[i];
                num = nums[i];
            }
        }
        return pos;
    }
}
