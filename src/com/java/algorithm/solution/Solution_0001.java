package com.java.algorithm.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetcodeProject
 * @description: java 1~50题
 * @author: Ya
 * @create: 2019-08-20 14:52
 **/
public class Solution_0001 {
    /**
     * 1. 两数之和
     * hashMap
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
