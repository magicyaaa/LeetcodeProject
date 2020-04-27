package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 33. 搜索旋转排序数组
 * @author: Ya
 * @create: 2020-04-27 00:43
 **/
public class Solution_0033 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (target >= nums[start] && target <= nums[end]) {
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else if (target >= nums[start] && target > nums[end]) {
            if (nums[mid] > nums[start] && nums[mid] > nums[end]) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                end = mid - 1;
            }
        } else {
            if (nums[mid] < nums[start] && nums[mid] <= nums[end]) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                start = mid + 1;
            }
        }
        return binarySearch(nums, target, start, end);
    }
}