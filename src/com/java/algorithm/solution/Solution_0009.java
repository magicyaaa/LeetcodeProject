package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 9. 回文数
 * @author: Ya
 * @create: 2019-09-12 15:28
 **/
public class Solution_0009 {
    /**
     * 要求不要将整数转为串来处理
     */
    public boolean isPalindrome(int x) {
        //负号肯定false
        if (x < 0) return false;
        int temp = x;
        int res = 0;
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return res == x;
    }
}
