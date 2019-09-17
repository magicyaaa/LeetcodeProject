package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 11. 盛最多水的容器
 * @author: Ya
 * @create: 2019-09-17 21:16
 **/
public class Solution_0011 {
    public int maxArea(int[] height) {
        int head = 0, tail = height.length - 1;
        int max = 0;
        while (head < tail) {
            max = Math.max(max, Math.min(height[head], height[tail]) * (tail - head));
            if (height[head] <= height[tail]) {
                head++;
            } else {
                tail--;
            }
        }
        return max;
    }
}
