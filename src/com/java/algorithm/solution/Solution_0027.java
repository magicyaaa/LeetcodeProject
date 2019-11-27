package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 27. 移除元素
 * @author: Ya
 * @create: 2019-11-24 16:12
 **/
public class Solution_0027 {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
