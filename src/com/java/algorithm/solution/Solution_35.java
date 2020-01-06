package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 35. 搜索插入位置
 * @author: Ya
 * @create: 2020-01-06 11:55
 **/
public class Solution_35 {
    /**
     * 二分法查找
     */
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int key, int start, int end) {
        if (key < nums[start]) {
            return start;
        } else if (key > nums[end]) {
            return end + 1;
        }
        int mid = (start + end) >> 1;
        if (key == nums[mid]) {
            return mid;
        }
        if (key > nums[mid]) {
            return binarySearch(nums, key, mid + 1, end);
        } else {
            return binarySearch(nums, key, start, mid - 1);
        }
    }
}
