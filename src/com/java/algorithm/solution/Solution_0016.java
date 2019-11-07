package com.java.algorithm.solution;

import java.util.Arrays;

/**
 * @program: LeetcodeProject
 * @description: 16. 最接近的三数之和
 * @author: Ya
 * @create: 2019-11-06 17:55
 **/
public class Solution_0016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sumThree = nums[i] + nums[left] + nums[right];
                if (Math.abs(sumThree - target) < Math.abs(closeNum - target)) {
                    closeNum = sumThree;
                }
                if (sumThree > target) {
                    right--;
                } else if (sumThree < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return closeNum;
    }
}
