package com.java.algorithm.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetcodeProject
 * @description: 18. 四数之和
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0018 {

    /**
     * 转化为三数之和问题
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        int sum, l, r;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        l = j + 1;
                        r = nums.length - 1;
                        while (l < r) {
                            if (l != j + 1 && nums[l] == nums[l - 1]) {
                                l++;
                                continue;
                            }
                            if (r != nums.length - 1 && nums[r] == nums[r + 1]) {
                                r--;
                                continue;
                            }
                            sum = nums[i] + nums[j] + nums[l] + nums[r];
                            if (sum - target == 0) {
                                resList.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                                l++;
                                r--;
                            } else if (sum - target > 0) {
                                r--;
                            } else {
                                l++;
                            }
                        }
                    }
                }
            }
        }
        return resList;
    }
}
