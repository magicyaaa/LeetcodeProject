package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 26. 删除排序数组中的重复项
 * @author: Ya
 * @create: 2019-11-24 16:12
 **/
public class Solution_0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index+1;
    }
}
