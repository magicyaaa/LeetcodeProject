package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 29. 两数相除
 * @author: Ya
 * @create: 2020-01-14 20:18
 **/
public class Solution_0029 {
    /**
     * 效率比较低的一种
     */
    public int divide(int dividend, int divisor) {
        boolean sign;
        if (dividend > 0 && divisor > 0) {
            sign = true;
        } else if (dividend < 0 && divisor < 0) {
            sign = true;
        } else if (dividend == 0) {
            return 0;
        } else {
            sign = false;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return -dividend;
            }
        }

        int i = 0;
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        while (dividend <= divisor) {
            dividend -= divisor;
            i++;
        }
        return sign ? Math.abs(i) : -Math.abs(i);
    }
}
