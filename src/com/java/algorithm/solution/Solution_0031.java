package com.java.algorithm.solution;

import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 31. 下一个排列
 * @author: Ya
 * @create: 2020-04-16 20:15
 **/
public class Solution_0031 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    revers(nums, i + 1, nums.length - 1);
                    return;
                }
            }
        }
        revers(nums, 0, nums.length - 1);
    }

    private void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    /**
     * 原地反转数组
     */
    private void revers(int[] array, int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    @Test
    public void test() {
        int[] nums = {1, 3, 2};
        Solution_0031 s = new Solution_0031();
        s.nextPermutation(nums);
    }

}
