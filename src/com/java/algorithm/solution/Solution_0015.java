package com.java.algorithm.solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @program: LeetcodeProject
 * @description: 15. 三数之和
 * @author: Ya
 * @create: 2019-09-28 22:07
 **/
public class Solution_0015 {
    /**
     * 取三个下标 i left right
     * i确定后，查找 nums[left]+ nums[right] = 0 - nums[i]
     * 将三数之和 转为两数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        int i, left, right, sum;
        for (i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                left = i + 1;
                right = nums.length - 1;
                sum = -nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        resList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                    } else if (nums[left] + nums[right] > sum) {
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    }
                }
            }
        }
        return resList;
    }
}



